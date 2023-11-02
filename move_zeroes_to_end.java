package DSA;
import java.util.*;
public class move_zeroes_to_end {
    static void move_zero(int arr[], int n){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }
        }
        int nz=temp.size();
        for(int i=0; i<nz; i++){
            arr[i] = temp.get(i); 
        }
        for(int i=nz; i<n; i++){
            arr[i] = 0;
        }
         System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,0,6,4,0,8,0,5};
        move_zero(arr,arr.length);

    }
    
}
