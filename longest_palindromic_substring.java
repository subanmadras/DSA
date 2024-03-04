package DSA;
import java.util.*;
public class longest_palindromic_substring {
    static String longest_palindrome(String str){
        int start = 0, end =0;
        for(int i=0; i<str.length(); i++){
            int odd = expand(str, i, i);
            int even = expand(str, i, i+1);

            int len = Math.max(odd, even);

            if(len > end-start){
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return str.substring(start, end+1);
    }
    static int expand(String str, int left, int right){
        while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
    public static void main(String[] args) {
        String str = "babad";
        System.out.println(longest_palindrome(str));
    }
    
}
