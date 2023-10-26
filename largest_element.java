package DSA;
import java.util.*;
public class largest_element {
    static void larger(int arr[], int n){
        int large = arr[0];
        for(int i=1; i<n; i++){
        if(arr[i]>large)
        large = arr[i];
        }
        System.out.println(large);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 6, 70, 1, 9};
        larger(arr, arr.length);
        
    }  
}
