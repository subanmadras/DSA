package DSA;
import java.util.*;
public class long_consecutive_sequence {
    static int opt_long_cons(int arr[], int n){
        int longest = 1;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(arr[i]);
        }
        for(int it : set){
            if(!set.contains(it-1)){ // this to check weather the current element has it's one lesser than element
                int x = it;
                int count = 1;
                while(set.contains(x+1)){
                    count += 1;
                    x += 1;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
    static boolean linearSearch(int arr[], int num){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
    static int long_cons(int arr[], int n){
        int longest = 1;
        for(int i=0; i<n; i++){
            int x = arr[i];
            int count = 1;
            while(linearSearch(arr, x+1) == true){
                x += 1;
                count +=1;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
    public static void main(String[] args) {
        int arr[] = {102,100,101,1,2,3,4};
        System.out.println(long_cons(arr, arr.length));
        System.out.println(opt_long_cons(arr, arr.length));
        
    }
    
}
