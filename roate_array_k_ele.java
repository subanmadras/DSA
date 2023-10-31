package DSA;
import java.util.*;
public class roate_array_k_ele {
    static void rotate_k(int arr[], int n, int k){
        int temp[] = new int[n];
        for(int i=n-k; i<n; i++){
            temp[i-n+k] = arr[i];
        }
        for(int i=n-k-1; i>=0; i--){
            temp[i+k] = arr[i];
        }
        
        System.out.println(Arrays.toString(temp));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] ={1,2,3,4,5,6,7};
        int n= arr.length;
        System.out.println("enter the key");
        int key =sc.nextInt(); 
        rotate_k(arr, n, key);

    }
    
}
