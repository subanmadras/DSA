package DSA;
import java.util.*;

public class koko_eat_bananas{
    /* OPTIMAL SOLUTION*/ 
    static int findMaxi(int v[]){
        int maxi = Integer.MIN_VALUE;
        int n = v.length;
        for(int i=0; i<n; i++){
            maxi =Math.max(maxi,v[i]);
        }
        return maxi;
    }

    static int Totalhours(int v[], int hourly){
        int totalhr = 0;
        int n = v.length;
        for(int i =0; i<n; i++){
            totalhr += Math.ceil((double)v[i] / (double)hourly);
        }
        return totalhr;
    }

    static int min_rate_to_eat_bananas(int v[], int h){
        int low = 1;
        int high = findMaxi(v);
        while(low <= high){
            int mid = (low+high) / 2;
            int totalhr = Totalhours(v,mid);
            if(totalhr <= h){
                high = mid-1;
            }else{
                low = mid+1;
            }  
        }
        return low;
    }
    /*BRUTE FORCE SOLUTION*/ 

    /*static int findMaxi(int v[]){
        int maxi = Integer.MIN_VALUE;
        int n = v.length;
        for(int i=0; i<n; i++){
            
            maxi =Math.max(maxi,v[i]);
        }
        return maxi;
    }
    static int Totalhours(int v[], int hourly){
        int totalhr = 0;
        int n = v.length;
        for(int i =0; i<n; i++){
            totalhr += Math.ceil((double)v[i] / (double)hourly);
        }
        return totalhr;
    }
    static int min_rate_to_eat_bananas(int v[], int h){
        int maxi = findMaxi(v);
        for(int i=1; i<=maxi; i++){
            int reqTime = Totalhours(v, i);
            if(reqTime <= h){
                return i;
            }
        }
        return maxi;
    }*/
    public static void main(String[] args) {
        int v[] = {7, 15, 6, 3};
        int h = 8;
        int ans = min_rate_to_eat_bananas(v,h);
        System.out.println(ans+" Bananas / hr");
    }
}

