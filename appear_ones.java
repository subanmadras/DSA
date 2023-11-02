package DSA;
import java.util.*;
public class appear_ones {
    static void optimal_appear_ones(int arr[], int n){
        int xor = 0;
        for(int i=0; i<n; i++){
            xor = xor^arr[i];
        }
        System.out.println("the number that appears exactlt ones is "+xor);
    }
    static void appeares_ones(int arr[], int n){
          boolean visited[]  = new boolean[n];
        for(int i=0; i<n; i++){
            if(visited[i] == true){
                continue;
            }
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(arr[j] == arr[i]){
                    visited[j] = true;
                    count++;
                }
            }if(count<=1)
             System.out.println("the number that appear ones is "+arr[i]);
        }
       
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4,1,4};
        appeares_ones(arr, arr.length);
        optimal_appear_ones(arr, arr.length);

    }
    
}
