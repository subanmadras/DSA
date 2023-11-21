package DSA;
import java.util.*;
public class next_permutation {
    static void permutation(int arr[], int n){
        int i = n-2;
        while(i >= 0 && arr[i] >= arr[i+1]){
            i++;
        }
        if(i >= 0){
            int j = n-1;
            while(arr[j] <= arr[i]){
              j--;
            }
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;

        }
        reverse(arr, i+1, n-1);
    }
    static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp =arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        permutation(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    
}
