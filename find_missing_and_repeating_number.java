package DSA;
import java.util.*;
public class find_missing_and_repeating_number {
    static int[] missing_repeating(int arr[], int n){
        int missing = -1;
        int repeating = -1;
        //this loop is to iterate on  each n every serial number from (1 - n)
        for(int i=1; i<=n; i++){
            int cnt = 0;
            // this loop is to check if the number repeats or not
            for(int j=0; j<n; j++){
                if(arr[j] == i)cnt++;
            }
            if(cnt == 2) repeating = i;
            else if(cnt == 0) missing = i;
            // this below condition is to break the loop after getting repeating  and missing number
            if(repeating != -1 && missing !=-1 ){
                break;
            } 
        }
        int[] ans ={repeating,missing};
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 5, 4, 6, 7, 5};
        System.out.println(Arrays.toString(missing_repeating(arr,arr.length)));
    }
    
}
