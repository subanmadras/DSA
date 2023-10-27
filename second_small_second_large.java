package DSA;
import java.util.*;
public class second_small_second_large {
    //brute force solution
    static void brute_solution(int arr[], int n){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; 
                }
            }
        }
        System.out.println("sec large "+arr[n-2]);
        System.out.println("sec small "+arr[1]);
    }
    //optimal solution
    static void better_solution(int arr[], int n){
        int small = Integer.MAX_VALUE;
        int sec_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int sec_large = Integer.MIN_VALUE;
        int i;
        for( i=0; i<n; i++){
            small = Math.min(small,arr[i]);
            large = Math.max(large,arr[i]);
        }
        for(i=0; i<n; i++){
            if(arr[i] < sec_small && arr[i] != small){
                sec_small = arr[i];
            }else if(arr[i] > sec_large && arr[i] != large){
                sec_large = arr[i];
            }
        }
        System.out.println("second small is "+sec_small);
        System.out.println("second large is "+sec_large);
    }
    public static void main(String[] args) {
        int arr[] = {3,4,10,7,8,1,22,11};
        int n =arr.length;
        better_solution(arr,n);
        brute_solution(arr,n);
    }
    
}
