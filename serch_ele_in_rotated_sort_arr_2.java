package DSA;
import java.util.*;
public class serch_ele_in_rotated_sort_arr_2 {
    static boolean search(int arr[], int k){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high) / 2 ;
            if(arr[mid] == k)
            return true;

            //edge case
            if(arr[low] == arr[mid]  && arr[mid] == arr[high]){
                low = low+1;
                high = high-1;
            }

            if(arr[low] <= arr[mid]){
                if(arr[low] <= k && k <= arr[mid]){
                    high = mid-1;
                }else{
                    low = mid + 1;
                }
            }else{
                if(arr[mid] <= k && k<= arr[high]){
                    low = mid+1;

                }else{
                    high = mid-1;
                }
            }

            }
        return false;
    }
    public static void main(String[] args) {
    int arr [] ={7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
    int k = 3;
    boolean ans = search(arr,k);
    if(ans == true){
        System.out.println("ele present");
    }else{
        System.out.println("ele not present");
    }
} 
}
