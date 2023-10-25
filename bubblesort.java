package DSA;

import java.util.Arrays;

public class bubblesort {
    static void bubbleSort(int arr[], int n){
        for(int i=0; i<n; i++){
            for(int j=i+1 ; j<n; j++){
                if(arr[j] <arr[i]){ // comapres first element with it's every adjacent element
                    int temp = arr[i];// swapping will be done
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = {8,7,5,12,4,10};
        bubbleSort(arr, arr.length);
    }
    
}
