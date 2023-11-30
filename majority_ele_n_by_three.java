package DSA;
import java .util.*;
public class majority_ele_n_by_three {
    static List<Integer> majority(int arr[]){
        int n= arr.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(list.size() == 0 || list.get(0) != arr[i]){
                int count = 0;
            for(int j=0; j<n; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            
                if(count > n/3)
                    list.add(arr[i]);
        }
                if(list.size() == 2)
                break;
            }
            return list;
        }
    public static void main(String[] args) {
        int arr[] ={1,2,2,3,2};
        List<Integer> ans = majority(arr);
        for(int i=0; i<ans.size(); i++){
            System.out.println(ans.get(i));
        }
    }
    
}
