package DSA;
import java.util.*;
public class square_root_of_no {
    static int optimal(int n){
        int low = 1;
         int high = n;

         while(low <= high){
            int mid = (low + high) / 2;
            int val = mid * mid;
            if(val <= n){
                low = mid+1;
            }else{
                high = mid-1;
            }
         }
         return high;
    }
    static int findsqrt(int n){
        int ans = -1;
        for(int i=1; i<=n; i++){
            if (i*i <= n){
                ans = i;
            }else{
                break;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int n = 39;
        // int ans = findsqrt(n);
        int ans = optimal(n);
        System.out.println(ans);
    }
    
}
