package DSA;
import java.util.*;
public class mergesort {
    static void merge(int arr[], int si, int mid, int ei){
        int merger[] = new int[(ei -si) + 1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1]<= arr[idx2]){
            merger[x++] = arr[idx1++];
            }else{
                merger[x++] = arr[idx2++]; 
            }
        }
        while(idx1 <= mid){
            merger[x++] = arr[idx1++]; 
        }
        while(idx2 <= ei){
            merger[x++] = arr[idx2++]; 
        }
        for(int i=0, j = si; i<merger.length; i++, j++){
            arr[j] = merger[i];
        }
        
    }
    static void merge_sort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = (si + ei) /2;
        merge_sort(arr, si, mid);
        merge_sort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void main(String[] args) {
      int arr[] = {9,4,7,6,3,1,5};
      merge_sort(arr, 0, arr.length-1);
      System.out.println(Arrays.toString(arr));
    }   
}
