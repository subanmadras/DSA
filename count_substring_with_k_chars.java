package DSA;
import java.util.*;
public class count_substring_with_k_chars {
    static int count_substring(String str, int k){
        int count = 0;
        int n = str.length();
        for(int i=0; i<n; i++){
            Set<Character> distchar = new HashSet<>();
            for(int j=i; j<n; j++){
                distchar.add(str.charAt(j));
                if(distchar.size() == k){
                    count++;
                }else if(distchar.size() > k){
                    break;
                }
            }
        }
        return count;
    }
        public static void main(String[] args) {
            String str = "abcad";
            int k  = 2;
            System.out.println(count_substring(str,k));
        }
}
