package DSA;
import java.util.*;
public class count_occurance_sorted_array {
   static int first_occurance(int arr[], int n, int x){
        int low = 0;
        int high = n-1;
        int first = -1;
        while(low<=high){
            int mid = (low + high) / 2;
            if(arr[mid] == x){
                first = mid;
                high = mid -1;
            }else if(arr[mid] < x){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return first;
    }
    static int last_occurance(int arr[], int n, int x){
        int low = 0;
        int high = n-1;
        int last = -1;
        while(low<=high){
            int mid = (low + high) / 2;
            if(arr[mid] == x){
                last = mid;
                low = mid+1;
            }else if(arr[mid] < x){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return last;
    }
    static int count_occurance(int arr[], int n, int x){
        int first = first_occurance(arr, n, x);
        int last = last_occurance(arr, n, x);
        return (last - first) + 1 ;
    }
    public static void main(String[] args) {
        int arr[] = {2,6,8,8,8,11,13};
        System.out.println(count_occurance(arr, arr.length, 8));
    }  
}
