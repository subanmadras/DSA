package DSA;
import java.util.*;
public class merge_two_sorted_array_without_extra_space {
    static void merge(long arr1[], long arr2[], int n, int m){
        long arr3[] = new long[n+m];
        int left = 0;
        int right = 0;
        int idx = 0;
        while(left<n && right<m){
            if(arr1[left]<=arr2[right]){
                arr3[idx++] = arr1[left++];
            }else{
                arr3[idx++] = arr2[right++];
            }
        }
        while(left<n){
            arr3[idx++] = arr1[left++];
        }
         while(right<m){
            arr3[idx++] = arr2[right++];
        }
        for(int i=0; i<n+m; i++){
            if(i<n){
                arr1[i] =arr3[i]; 
            }else{
                arr2[i-n] = arr3[i];
        }
    }
}
static void optimal(long arr1[], long arr2[], int n, int m){
    int left = n-1;
    int right = 0;
    while(left >= 0 && right < m){
        if(arr1[left] > arr2[right]){
            long temp = arr1[left];
            arr1[left] = arr2[right];
            arr2[right] = temp;
            left--;
            right++;
         }else{
            break;
         }
    }
    Arrays.sort(arr1);
    Arrays.sort(arr2);
}
    public static void main(String[] args) {
        long arr1[] = {1,4,8,10};
        long arr2[] = {2,3,9};
       // merge(arr1,arr2,arr1.length,arr2.length);
       optimal(arr1,arr2,arr1.length,arr2.length);
        System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
    }
    
}
    
