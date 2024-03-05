package DSA;
import java.util.*;
public class sum_of_beauty_of_all_substrings {
    static int sum_of_all_substr(String str){
        int res = 0;
        for(int i=0; i<str.length(); i++){
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j= i+1; j<=str.length(); j++){
                int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

                map.put(str.charAt(j-1), map.getOrDefault(str.charAt(j-1), 0)+1);

                if(map.size() == 1) continue;
                else{
                    for(Map.Entry<Character, Integer> entry : map.entrySet()){
                        max = Math.max(max,entry.getValue());
                        min = Math.min(min,entry.getValue());
                    }
                    res += (max -min);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "aabcb";
        System.out.println(sum_of_all_substr(str));
    }
    
}
