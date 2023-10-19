package DSA;
import java.util.*;
public class minMaxFreq {
    static void minMaxfreq(int arr[], int n){
        boolean visited[] = new boolean[n];
        int maxfreq = 0, minfreq = n;
        int maxEle = 0, minEle = 0;
        for(int i=0; i<n; i++){

            //skip this elemnt if already existed
            if(visited[i] == true)
            continue;

            //count frequency
            int count=1;
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;   
                }
            }
           // System.out.println(arr[i]+" "+count);
           if(count>maxfreq){
            maxEle = arr[i];
            maxfreq = count;
           }
           if(count<minfreq){
            minEle = arr[i];
            minfreq = count;
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
