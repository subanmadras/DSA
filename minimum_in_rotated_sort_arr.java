package DSA;
import java.util.*;
public class minimum_in_rotated_sort_arr {
    static int search_min(int arr[], int n){
        int low = 0;
         int high = n-1;
         int ans = Integer.MAX_VALUE;
         while(low <= high){
            int mid = (low + high) / 2;
            if(arr[low] <= arr[mid]){
                ans =Math.min(ans, arr[low]);
                
                
                low = mid+1; // eleminate the left half
            }else{
                ans = Math.min(ans, arr[mid]);

                high = mid-1; //eliminate the right half
            }
         }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 10, 1, 2, 3};
        int n = arr.length;
        int ans = search_min(arr,n);
        System.out.println("min ele is : "+ans);
    }
}
