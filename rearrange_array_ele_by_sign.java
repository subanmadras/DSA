package DSA;
import java.util.*;
public class rearrange_array_ele_by_sign {
    static void rearrange(int arr[], int n){
       ArrayList<Integer>pos = new ArrayList<>();
        ArrayList<Integer>neg = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i] < 0){
                neg.add(arr[i]);
            }else{
                pos.add(arr[i]);
            }
        }
        for(int i=0; i<n/2; i++){
            arr[2*i] = pos.get(i);
             arr[2*i+1] = neg.get(i);
        }
        
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,-5,-6,-7};
        rearrange(arr, arr.length);
    }
    
}
