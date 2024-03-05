package DSA;
import java.util.*;
public class reverse_words_of_string {
    static String reverse_word(String str){
        String s[] = str.split(" ");
        String ans = "";
        for(int i = s.length-1; i>=0; i--){
            ans +=s[i] + " ";
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "welcome to Continental";
        System.out.println(reverse_word(str));
    }
    
}
