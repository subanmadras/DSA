package DSA;
import java.util.HashSet;
import java.util.Iterator;
public class hashset {
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();
        //to add elements in set use add fucntion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(9);
        set.add(10);
        set.add(1);
        //to remove elements in set use remove function
        set.remove(2);
        //to print all elements of set  
        System.out.println(set);
        //to check whether a element exists in a set or not use contains fucntion
        if(set.contains(1)){
            System.out.println("contains 1");
        }
         if(!set.contains(6)){
            System.out.println("does contain 6");
        }
        //to check set size use size function
        System.out.println("size of set is "+set.size());

        //iterator in set
        Iterator it = set.iterator();
        
        //to iterate through each elemet in a set use below methods
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
