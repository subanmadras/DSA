package DSA;
import java.util.*;
public class how_many_times_arr_rotated {
    static int count_roatated(int arr[], int n){
        int low = 0;
        int high=n-1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while(low <= high){
            int mid= (low+high) / 2;


            if(arr[low] <= arr[high]){
                if(arr[low] < ans){
                    index = low;
                    ans = arr[low];
                }
                break;
            }

            if(arr[low] <= arr[mid]){
                if(arr[low] < ans){
                    index = low;
                    ans = arr[low];
                }
                 low = mid+1;
            } else {
                
                if(arr[mid] < ans){
                    index = mid;
                    ans = arr[mid];
                }

                high = mid-1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2, 3};
        int n = arr.length;
        int ans = count_roatated(arr,n);
        System.out.println(ans);
    }
    
}
