package DSA;
import java.util.*;
public class nth_root_of_no {
    static int optimal(int mid, int n, int m){
        int ans = 1;
        for(int i=1; i<= n; i++){
            ans = ans * mid;
            if(ans < m)
            return 2;
        }
        if(ans == m)
        return 1;

        return 0;
    }
    static int nth_root(int n, int m){
        int low = 1, high = m;
        while(low <= high){
            int mid = (low+high) / 2;
            int midN = optimal(mid, n, m);
            if(midN == 1){
                return mid;
            }else if(midN == 0){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
    static int func(int  b, int exp){
        int ans = 1;
        int base = b;
        while(exp > 0){
            if(exp %2 ==1){
                exp--;
                ans= ans*base;
            }else{
                exp /=2;
                base = base *base;
            }
        }
        return ans;

    }
    static int root(int n, int m){
        for(int i=1; i<= m; i++){
            int val = func(i, m);
            if(val == m){
                return i;
            }else if(val > m){
                break; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n= 3, m= 27;
        int ans = nth_root(n,m);
        System.out.println(ans);
    }
}
