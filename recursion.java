package DSA;
import java.util.*;
public class recursion {
    static void fact(int n, int sum){
        if(n==0){
            System.out.println(sum);
        return;
        }
       sum=sum*n;
        fact(n-1,sum);
    }
    public static void main(String args[]){
        fact(5,1);
    }
}
