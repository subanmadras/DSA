package DSA;
import java.util.*;
public class stock_buy_sell {
    static int buy_sell(int arr[], int n){
       int maxi = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(arr[j] > arr[i]){
                    maxi = Math.max((arr[j] - arr[i]), maxi);
                }   
        }
    }
      return maxi;  
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(buy_sell(arr, arr.length));
    }
    
}
