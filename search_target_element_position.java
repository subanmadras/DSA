package DSA;
import java.util.*;
public class search_target_element_position {
    static int search_element_position(int arr[], int target){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] >= target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,7};
        System.out.println(search_element_position(arr, 6));
    }   
}