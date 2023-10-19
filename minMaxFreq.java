package DSA;
import java.util.*;
public class minMaxFreq {
    static void minMaxfreq(int arr[], int n){
        Map<Integer,Integer> map = new HashMap<>();
       
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
             int maxfreq = 0, minfreq = n;
             int maxEle = 0, minEle = 0;
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                int count = entry.getValue();
                int element = entry.getKey(); 
                if(count>maxfreq){
                    maxfreq = count;
                    maxEle = element;
                } 
                if(count<minfreq){
                    minfreq = count;
                    minEle = element;
                } 
                }
                System.out.println("max elemnt "+maxEle+" freq -->"+maxfreq);
        System.out.println("min element "+minEle+" freq -->"+minfreq);
            }
          

    public static void main(String[] args) {
        int arr[] = {10,20,20,10,30,40,50,40,40,10,70,10,67,10};
        minMaxfreq(arr,arr.length);
    }

    
}
