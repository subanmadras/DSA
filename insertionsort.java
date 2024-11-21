package DSA;
import java.util.*;
public class insertionsort {
    static void insert(int arr[], int n){
        for(int i=0; i<n; i++){ // runs a loop from first to last element
            int j=i;  // intializing j as equal to i
            while(j>0 && arr[j-1] > arr[j]){ // compares unsorted array elements with sorted part and puts the unsorted element into it's correct position in sorted part
                int temp = arr[j-1]; //swapping will be done
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--; // decrement the array so that it'll be cimpared against left side of the sorted array part
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        insert(arr, arr.length);

    }
    
}
