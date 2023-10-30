package DSA;
import java.util.*;
public class array_is_sorted {
    static boolean optimal_isSorted(int arr[], int n){
        for(int i=1; i<n; i++){
           if(arr[i]<arr[i-1]){
           return false;
           }
            }
        return true;
    }
    static boolean brute_isSorted(int arr[], int n){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[i])
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,9,1,2,3};
        boolean result= brute_isSorted(arr,arr.length);
        if(result == true){
            System.out.println("sorted");
        }else{
            System.out.println("unsorted");
        }
        System.out.println(optimal_isSorted(arr, arr.length));
    }
    
}
