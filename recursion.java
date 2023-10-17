package DSA;
import java.util.*;
public class recursion {
    static String palindrome(String str, int i,String nstr) {
       if(i<0){
        return nstr;
       }
        nstr=nstr+str.charAt(i);
        return palindrome(str,i-1,nstr); 
    }

    public static void main(String args[]) {
        String str = "gadag";
        int n = str.length()-1;
        String result = palindrome(str,n,"");
        if(result.equals(str))
        System.out.println("palindrome");
        else
        System.out.println("not a plaindrome");
    }
}
