package DSA;
import java.util.*;
public class length_of_longest_sub_array_sum_zero {
    static int optimal_sol(int arr[]){
        int max = 0;
        int sum = 0;
        HashMap<Integer, Integer> mpp = new HashMap<Integer,Integer>();
        for(int i=0; i<arr.length; i++){
            sum +=arr[i];
            if(sum == 0){
                max = i+1;
            }else{
                if(mpp.get(sum) != null){
                    max = Math.max(max, i-mpp.get(sum));
                }else{
                    mpp.put(sum,i);
                }
            }
        }
        return max;
    }
    static int long_sub_array(int arr[], int n){
        int len = 0;
        for(int i=0; i<n; i++){
            long sum = 0;
            for(int j=i; j<n; j++){
                sum +=arr[j];
                if(sum == 0)
                len = Math.max(len, j-i+1);
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int arr[] = {9, -3, 3, -1, 6, -5};
       // System.out.println( long_sub_array(arr, arr.length));
        System.out.println( optimal_sol(arr));
    }
    
}
