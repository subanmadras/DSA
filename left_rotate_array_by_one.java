package DSA;
import java.util.*;
public class left_rotate_array_by_one {
    static void optimal_rotate(int arr[], int n){
        int temp =arr[0];
        for(int i=0; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
    static void brute_rotate(int arr[], int n){
        int temp[] = new int[n];
        for(int i=1; i<n; i++){
            temp[i-1] = arr[i];
        }
        temp[n-1] = arr[0];
        System.out.println(Arrays.toString(temp));
    }
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5,6};
       brute_rotate(arr, arr.length);
       optimal_rotate(arr, arr.length);

    }
    
}
