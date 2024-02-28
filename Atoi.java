package DSA;
import java.util.*;
public class Atoi {
    static int atoi_function(String str){
        int sign =1, result = 0, index = 0;
        while(index < str.length() && str.charAt(index) == ' ')
        index++;
        if(index < str.length() && (str.charAt(index) == '-' || str.charAt(index) == '+')){
            sign = (str.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        while (index < str.length() && Character.isDigit(str.charAt(index))) {
            int digit = str.charAt(index) - '0';
            if(result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)){
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            index++;
            
        }
        return result * sign;
        
    }
    public static void main(String[] args) {
        String str = "143 ily";
        System.out.println(atoi_function(str));
    }
    
}
