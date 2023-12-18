package DSA;
import java.util.*;
public class lower_bound_binary_search {
    static int lower_bound(int arr[], int n, int x){
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] >= x){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 8, 15, 19};
        int n = arr.length;
       System.out.println(lower_bound(arr, n, 9)); 
    }    
}
