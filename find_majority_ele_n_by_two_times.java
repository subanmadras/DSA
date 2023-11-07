package DSA;
import java.util.*;
public class find_majority_ele_n_by_two_times {
    static void brute_find_major(int arr[], int n){
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count>(n/2))
            System.out.println(arr[i]);
            return;
        }
        
    }
    static int optimal_find_major(int arr[], int n){
        int count = 0;
        int el = 0;
        for(int i=0; i<n; i++){
            if(count == 0){
                count = 1;
                el = arr[i];
            }else if(el == arr[i])
            count++;
            else
            count--;
        }
        int count1 = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == el){
                count1++;
            }
        }
        if(count1>(n/2))
        return el;
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,4,2,4,3,4,4,3,2,4};
        brute_find_major(arr, arr.length);
       System.out.println(optimal_find_major(arr, arr.length));
    }
    
}
