package DSA;
import java.util.*;
public class selectionsort {
    static void selection(int arr[],int n){
        for(int i =0; i<n; i++){
            int min = i; // intitially the min elemnt is 1st element of array
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[min])
                    min = j; // changing min element by comparing
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int arr[] = {5,8,3,2,4,1};
        selection(arr,arr.length);
    }
    
}
