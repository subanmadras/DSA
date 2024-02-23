package DSA;
import java.util.*;
public class sort_string_based_on_frequency_of_chars {
    static String sort_string(String s){

        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Character> pq = new PriorityQueue<>();

        // iterate over each char and put it's char and frequency into map
        for (char ch  : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1); 
        }

        // iterate over keyset in map and put it's value in priorityQueue
        for(char c:map.keySet()){
            pq.offer(c);
        }

        // take a string builer and put pq value into String builder
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            char ch =pq.poll();

            for(int i=0; i<map.get(ch); i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s ="tree";
        System.out.println(sort_string(s));
    }
}