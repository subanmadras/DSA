package DSA;
import java.util.*;
public class three_sum_add_upto_zero {
    static List<List<Integer>> optimal_sol(int arr[], int n){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            if(i != 0 && arr[i] == arr[i-1]) continue;

                int j = i+1;
                int k = n-1;
                while(j<k){
                    int sum = arr[i]+arr[j]+arr[k];
                    if(sum<0){
                        j++;
                    }else if(sum>0){
                        k--;
                    }else{
                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                        ans.add(temp);
                        j++;
                        k--;
                        while(j < k && arr[j] == arr[j-1])j++;
                        while(j < k && arr[k] == arr[k+1])k--;
            }
        }
    }
    return ans;
}
    static List<List<Integer>> three_sum(int arr[], int n){
        Set<List<Integer>> st = new HashSet<>();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    temp.sort(null);
                    st.add(temp);
                }
            }
        }
    }
    List<List<Integer>> ans = new ArrayList<>(st);
    return ans;
}
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        int n = arr.length;
       // List<List<Integer>> ans = three_sum(arr,n);// brute force solution
        List<List<Integer>> ans = optimal_sol(arr,n); // optimal solution
        for(List<Integer> it : ans){
            System.out.print("[");
            for(Integer i : it){
                System.out.print(i+" ");
            }
            System.out.println("]");
        }
        System.out.println();
    }  
}
