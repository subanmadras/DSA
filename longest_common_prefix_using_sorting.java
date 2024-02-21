package DSA;
import java.util.*;
public class longest_common_prefix_using_sorting {
    static String longest_common_prefix(String str[]){
        int size = str.length;
        if(size == 0)
            return "";

            if(size == 1)
            return str[0];
            Arrays.sort(str);

            /* find the minimum length from first and last string */
            int end = Math.min(str[0].length(), str[size-1].length());
            int i = 0;

             /* find the common prefix between the first and last string */
            while(i < end && str[0].charAt(i) == str[size-1].charAt(i)) 
            i++;
            String pre = str[0].substring(0,i);
            return pre;
    }
    public static void main(String[] args) {
        String str[] = {"Geeks", "Geek", "Geeky"};
        System.out.println(longest_common_prefix(str));
    }
    
}
