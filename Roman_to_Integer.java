package DSA;
import java.util.*;
public class Roman_to_Integer {
    static int get_val(char ch){
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    static int rom_to_int(String s){
        int n = s.length();
        int sum =0;
        for(int i=0; i<n; i++){
            char ch1 = s.charAt(i);
            if((i+1)<n && get_val(ch1) < get_val(s.charAt(i+1))){
                sum = sum - get_val(ch1);
            }else{
                sum = sum + get_val(ch1);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String s ="MCMXCIV";
        System.out.println(rom_to_int(s));
    }
    
}
