package DSA;
import java.util.*;
public class peak_ele {
    static int peak_ele(ArrayList<Integer> arr){
        int n= arr.size();
        if (n==1)
        return 0;
        if (arr.get(n-1) > arr.get(n-2))
        return 0;
        int low = 1;
        int high = n-2;
        while (low <= high) {
            int mid = (low+high) / 2;
            if(arr.get(mid) > arr.get(mid-1) && arr.get(mid) > arr.get(mid+1)){
                return mid;
            }
            if(arr.get(mid) > arr.get(mid-1)){
                low = mid+1;
            }else{
                high = mid -1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 5, 1));
        int ans = peak_ele(arr);
        System.out.println(ans);
    }   
}
