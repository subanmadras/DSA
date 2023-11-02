package DSA;
public class missing_no {
    static int missing_number(int arr[], int n){
        for(int i=0; i<n; i++){
            if(i == n-1){
                return -1;
            }else if(arr[i+1] != arr[i]+1){
                return arr[i]+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
      int arr[] = {1,2,4,5};
      System.out.println(missing_number(arr, arr.length));

    }  
}
