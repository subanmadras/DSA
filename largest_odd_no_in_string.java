package DSA;
import java.util.*;
public class largest_odd_no_in_string {
    static String maxOdd(String str){
        for(int i = str.length()-1; i>=0; i--){
            if(str.charAt(i) %2 != 0 ){
                String s = str.substring(0,i+1);
                return s;
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String str = "504";
        String ans =maxOdd(str);
        System.out.println(ans);
    }
    
}
