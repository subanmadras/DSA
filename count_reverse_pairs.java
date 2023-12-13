package DSA;
import java.util.*;
public class count_reverse_pairs {
    static int reverse_pairs(int arr[], int n){
        int count = 0; 
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] > 2*(arr[j])){
                    count++;
                }
            }
        }
        return count;
    }
    static void merge(int arr[], int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr[left]);
                left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
    }
    static int countpairs(int arr[], int low, int mid, int high){
        int right = mid+1;
        int count = 0;
        for(int i = low; i <= mid; i++){
            while(right <= high && arr[i] > 2*(arr[right])){ 
                right++;
                count += (right - (mid+1));
            }
        }
        return count;
    }
    static int mergesort(int arr[], int low , int high){
        int count =0;
        if(low>=high){
            return count;
        }
        int mid = (low+high)/2;
        count += mergesort(arr, low, mid);
        count += mergesort(arr, mid+1, high);
        count +=  countpairs(arr, low, mid, high);
        merge(arr, low, mid, high);
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {4, 1, 2, 3, 1};
       // System.out.println(reverse_pairs(arr, arr.length));
       System.out.println(mergesort(arr, 0, arr.length-1));
    }  
}
