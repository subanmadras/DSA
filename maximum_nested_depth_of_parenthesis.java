package DSA;
import java.util.*;
public class maximum_nested_depth_of_parenthesis {
    static int max_depth(String s){
        int max_depth = 0;
        int current_depth = 0;
        for(char c: s.toCharArray()){
            if(c == '('){
            current_depth++;
            max_depth = Integer.max(max_depth, current_depth);
            }else if(c ==')'){
                current_depth--;
            }
        }
        return max_depth;
    }
    public static void main(String[] args) {
        String s="(1+(2*3)+((8)/4))+1";
        System.out.println(max_depth(s));
    }
    
}
