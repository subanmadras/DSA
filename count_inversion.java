package DSA;
import java.util.*;
public class count_inversion {
    static int optimal(int arr[], int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int count = 0;
        int left = low;
        int right = mid+1;
        while(left<=mid && right<= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                count += (mid - left + 1);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
                left++;
        }
         while(right<=high){
            temp.add(arr[right]);
                left++;
        }
        for(int i =low; i<=high; i++){
            arr[i] = temp.get(i - low);
        }
        return count;
    }
    static int mergesort(int arr[], int low, int high){
        int count = 0;
        if(low >= high){
            return count;
        }
        int mid = (low + high) / 2;
        count += mergesort(arr, low, mid);
        count += mergesort(arr, mid+1, high);
        count += optimal(arr,low,mid,high);
        return count;
    }
    static int count_inversions(int arr[], int n){
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] > arr[j])
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {5,3,2,4,1};
        int ans = count_inversions(arr, arr.length);
       // System.out.println(ans);
       System.out.println(mergesort(arr, 0, arr.length - 1));
    }
}
