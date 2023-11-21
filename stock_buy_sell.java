package DSA;
import java.util.*;
public class stock_buy_sell {
     static int optimal_buy_sell(int arr[], int n){
       int maxi = 0;
       int minPrice = arr[0];
        for(int i=1; i<n; i++){
                if(arr[i] > minPrice){
                    int profit = arr[i] - minPrice;
                    maxi = Math.max(profit, maxi);
                }else{
                    minPrice = arr[i];
                } 
        }
      return maxi;  
    }
    static int brute_buy_sell(int arr[], int n){
       int maxi = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(arr[j] > arr[i]){
                    maxi = Math.max((arr[j] - arr[i]), maxi);
                } 
                } 
    }
    if(maxi<0){
        return 0;
    }
      return maxi;  
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(brute_buy_sell(arr, arr.length));
        System.out.println(optimal_buy_sell(arr, arr.length));
    }
}
