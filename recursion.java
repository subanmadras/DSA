package DSA;
import java.util.*;
public class recursion {
    static void revArr(int n, int arr[]){
        int narr[] = new int[n];
        for(int i=n-1; i>=0; i--){
          narr[n-i-1] = arr[i];  
        }
        System.out.println(Arrays.toString(narr));
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
       revArr(5,arr);
    }
}
