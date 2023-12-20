package DSA;
import java.util.*;
public class floor_ceil {
    static int get_floor(int arr[], int n, int x){ //  fllor means largest no in an array
        int ans = n;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] <= x){
                ans = arr[mid];
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
     static int get_ceil(int arr[], int n, int x){ //ceil means smallest no in an array
        int ans = n;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] >= x){
                ans = arr[mid];
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    static int[] get_floor_ceil(int arr[], int n, int x){
        int floor = get_floor(arr, n, x);
        int ceil = get_ceil(arr, n, x);
        return new int[] {floor, ceil};
    }
    public static void main(String[] args){
        int arr[] = {3,4,4,7,8,10};
        int x= 5;
        int ans[] = get_floor_ceil(arr, arr.length, x);
        System.out.println(Arrays.toString(ans));
    }
    
}
