package DSA;
import java.util.*;
public class search_ele_in_rotated_sort_array {
    static int search_ele(int arr[], int n, int k){
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low+high / 2;
            if(arr[mid] == k)
                return mid;

            if(arr[low] <= arr[mid]){
                if(arr[low] <= k && k <= arr[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                    }
            }else{
                    if(arr[mid] <= k && k <= arr[high]){
                        low = mid+1;
                    }else{
                        high = mid-1;
                    }
                }
            }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {7,8,9,12,3,4,5,6};
        int n = arr.length;
        System.out.println(search_ele(arr,n,12));
    }
}
