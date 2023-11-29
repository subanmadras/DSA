package DSA;
import java.util.*;
public class leaders {
     static ArrayList<Integer> optimal_printLeaders(int arr[], int n){
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[n-1];
        ans.add(max);
        for(int i=n-2; i>=0; i--){
            if(arr[i]>max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        return ans;
    }
    static ArrayList<Integer> printLeaders(int arr[], int n){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            boolean leader = true;
            for(int j=i+1; j<n; j++){
                if(arr[j] > arr[i]){
                    leader = false;
                }
            }
            if(leader){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[] = {10, 22, 12, 3, 0, 6};
        //System.out.println( printLeaders(arr, arr.length));
         System.out.println( optimal_printLeaders(arr, arr.length));
    }   
}
