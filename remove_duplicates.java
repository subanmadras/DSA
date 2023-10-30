package DSA;
import java.util.*;
public class remove_duplicates {
    static int optimal_remove_dupl(int arr[], int n){
        int i=0;
        for(int j=1; j<n; j++){
            if(arr[i] != arr[j]){
                 i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    static int brute_remove_dupl(int arr[], int n){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(arr[i]);
        }
        int k= set.size();
        int x=0;
        for(int j:set){
            arr[x++] =j;
        }
        return k;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,5,4};
        int ans = optimal_remove_dupl(arr, arr.length);
        for(int i=0; i<ans; i++){
            System.out.print(arr[i]+",");
        }

        
    }
    
}
