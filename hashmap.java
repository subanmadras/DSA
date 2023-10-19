package DSA;
import java.util.HashMap;
import java.util.Map;
public class hashmap {
    public static void main(String args[]){
        //hasmap creation
        HashMap<String,Integer> map = new HashMap<>();

        //insertion operation
        map.put("india",150);
        map.put("china", 165);
        map.put("USA",80);

        //modify value of china
        map.put("china", 34);

        //this will print the map but in a random order
        System.out.println(map);

        //search ooperations in map
        if(map.containsKey("indonesia"))
        {
            System.out.println("indonesia exist");
        }else
        {
                System.out.println("indonesia doesn't exist");
            }
            //iterating method on a hashmap through for each loop
            for(Map.Entry<String,Integer> e : map.entrySet()){
               System.out.println(e.getKey());
                System.out.println(e.getValue());
            }
        }
    }

