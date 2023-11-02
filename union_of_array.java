package DSA;
import java.util.*;
public class union_of_array {
    static void union(int arr1[], int arr2[], int n1, int n2){
        HashSet<Integer> list = new HashSet<>();
        for(int i=0; i<n1; i++){
            list.add(arr1[i]);  
        }
         for(int i=0; i<n2; i++){
            list.add(arr2[i]);
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,2,1};
        int arr2[] = {4,5,6,4,5,7,8,9,3};
        union(arr1, arr2, arr1.length, arr2.length);
    }
    
}
