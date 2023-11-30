package DSA;
import java.util.*;
public class pascals_traingle {
    static int nCr(int n, int r){
        int res = 1;
        for(int i=0; i<r; i++){
            res = res*(n-i);
            res = res/(i+1);
        }
        return (int) res;
    }
    static int variation1_pascal(int r, int c){
        int element =(int) nCr(r-1, c-1);
        return element;
    }
    static void variation_2(int n){
        for(int c = 1; c<=n; c++){
            System.out.print(nCr(n-1,c-1)+" ");
        }
    }
    static List<List<Integer>> variation_3(int n){
        List<List<Integer>> ans = new ArrayList<>();
        for(int row = 1; row<=n; row++){
            List<Integer> templist =  new ArrayList<>();
            for(int col=1; col<=row; col++){
                templist.add(nCr(row-1,col-1));
            }
            ans.add(templist);
        }
        return ans;
    }
    public static void main(String[] args) {
        int r = 5;
        int c = 3;
        int n = 5;
       // variation_2(n);
        
        List<List<Integer>> ans = variation_3(n);
        for(List<Integer> it : ans){
            for(int ele : it){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        // int element = variation1_pascal(r,c);
        // System.out.println(element);
    }
    
}
