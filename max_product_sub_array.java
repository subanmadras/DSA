package DSA;
import java.util.*;
public class max_product_sub_array {
    static int prod_sub_array(int arr[], int n ){
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }else if(arr[i] > max2){
                max2 = arr[i];
            }
            if(arr[i] < min1){
                min2 = min1;
                min1 = arr[i];
            }else if(arr[i] < min2){
                min2 = arr[i];
            }
        }
        return Math.max(max1*max2, min1*min2);
    }
    static int brute_sol(int arr[], int n){
        int max = 1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int prod = arr[i] *arr[j];
                max = Math.max(max,prod);
        }
    }
        return max;
    }
        
    public static void main(String[] args) {
        int arr[] = {1,2,-3,0,-4,-5};
        System.out.println(prod_sub_array(arr, arr.length));
        System.out.println(brute_sol(arr, arr.length));
    }  
}
