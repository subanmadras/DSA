package DSA;
import java.util.*;
public class rotate_string {
    static boolean cocatenate(String s1, String goal){
        if(s1.length() != goal.length())
        return false;

        String concatenated = s1 + s1;
        return concatenated.contains(goal);

    }
    public static void main(String[] args) {
        String s1 = "abcde";
        String goal = "cdeab";

        System.out.println(cocatenate(s1,goal));
    }
}
