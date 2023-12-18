package DSA;
import java.util.*;
public class binary_search1 {
    static int binary_search(int arr[], int low, int high, int target){
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(target < arr[mid]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
    static int recursive(int arr[], int low, int high, int target){
        if(low>=high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid] == target){
            return mid;
        }else if(target < arr[mid]){
            recursive(arr, low, mid-1, target);
        }else{
            recursive(arr, mid+1, high, target);
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(binary_search(arr, 0, arr.length-1, 8));
        System.out.println(recursive(arr, 0, arr.length-1, 8));
    }
    
}
