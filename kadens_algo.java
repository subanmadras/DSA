package DSA;
import java.util.*;
public class kadens_algo {
    static int better_solution(int arr[], int n){
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum +=arr[j];
                 maxi = Math.max(maxi, sum);
            }  
        }
          return maxi;
    }
    static long optimal_solution(int arr[], int n){
        long maxi =Long.MIN_VALUE;
        long sum = 0;
        for(int i=0; i<n; i++){
            sum +=arr[i];
            if(sum > maxi){
                maxi = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(better_solution(arr, arr.length));
       System.out.println(optimal_solution(arr, arr.length)); 
    }
    
}
