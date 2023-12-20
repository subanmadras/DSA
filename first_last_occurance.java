package DSA;
import java.util.*;
public class first_last_occurance {
    static int[] occurances(int arr[], int n, int x){
        int first = -1;
        int last = -1;
        for(int i=0; i<n; i++){
            if(arr[i] == x){
                if(first == -1){
                    first = i; 
                }else{
                    last = i;
                }
            }
        }
        return new int[] {first,last};
    }
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
    static int[] optimal(int arr[], int n, int x){
        int first = first_occurance(arr, n, x);
        int last = last_occurance(arr, n, x);
        return new int[] {first, last};
    }
    public static void main(String[] args) {
        int arr[] = {2,6,8,8,8,11,13};
        // int ans[] = occurances(arr, arr.length, 8);
        // System.out.println(Arrays.toString(ans))
        System.out.println(Arrays.toString(optimal(arr, arr.length, 8)));
    }  
}
