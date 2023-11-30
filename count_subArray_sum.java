package DSA;
import java.util.*;
public class count_subArray_sum {
    static int count_subarray_sum(int arr[], int k){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];

                 if(sum == k)
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2,4};
        int k = 6;
        int ans = count_subarray_sum(arr,k);
        System.out.println(ans);
    }  
}
