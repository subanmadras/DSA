package DSA;
import java.util.*;
public class quicksort {
    static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        //to comapre elements with pivot elements and put them in either left or right
        for(int j=si; j<ei; j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //to store pivot make a empty space
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[ei] = temp;
        return i;

    }
    static void qsort(int arr[], int si, int ei){
        if(si<ei){
            int pivot = partition(arr,si,ei);
             qsort(arr, si, pivot-1);
             qsort(arr, pivot+1, ei);
   
   }     
 }
    public static void main(String[] args) {
       int arr[] = {2,1,3,4,6,5,7,9};
       qsort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
}
