package DSA;

public class linear_Search {
    static void isPresent(int arr[], int n, int no){
        for(int i=0; i<n; i++){
            if(arr[i] == no){
                System.out.println(i);
                return;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int no= 6;
        isPresent(arr, arr.length, no);

    }
    
}
