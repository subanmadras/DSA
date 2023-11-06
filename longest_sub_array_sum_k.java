package DSA;
import java.util.*;
public class longest_sub_array_sum_k {
    static int brute_longest_sub_arr(int arr[], long k)
    {
        int n =arr.length;
        int len = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                long s= 0;
                for(int K =i; K<=j; K++){
                    s+=arr[K];
                }
                if(s==k)
                len = Math.max(len,j-i+1);
        }
    }
    return len;
}
static int better_longest_sub_arr(int arr[], long k)
    {
        int n =arr.length;
        int len = 0;
        for(int i=0; i<n; i++){
            long s= 0;
            for(int j=i; j<n; j++){
                s +=arr[j];
                 if(s==k)
                len = Math.max(len,j-i+1);
        }
    }
    return len;
}
    public static void main(String[] args) {
        int arr[] = {2,3,5,1,9};
        System.out.println( brute_longest_sub_arr(arr, 10));
         System.out.println( better_longest_sub_arr(arr, 10));
        
    }
}
