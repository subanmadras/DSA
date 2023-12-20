package DSA;
import java.util.*;
public class upper_bound_binary_search {
    static int lower_bound(int arr[], int target, int n ){
        int ans  = n;
        int low = 0;
         int high = n-1;
        while(low <= high){
            int mid = (low+high) / 2;
            if(arr[mid] > target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1; 
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 8, 9, 15, 19};
        System.out.println(lower_bound(arr, 9,  arr.length));
    }
    
}
