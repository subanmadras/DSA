package DSA;
import java.util.*;
public class sort_zeroes_ones_twos {
    static void sort(ArrayList<Integer> list, int n){
        int low = 0, mid = 0, high = n-1;
        while(mid<=high){
            if(list.get(mid) == 0){
                int temp = list.get(low);
                list.set(low,list.get(mid));
                list.set(mid,temp);
                mid++;
                low++;
            }else if(list.get(mid) == 1){
                mid++;
            }else{
                int temp = list.get(mid);
                list.set(mid,list.get(high));
                list.set(high, temp);
                high--;
            }
        }
        System.out.println(list);

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{0,2,1,2,0,1}));
        sort(list,list.size());

    }
    
}
