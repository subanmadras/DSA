package DSA;

public class countfrequency {
    static void countfreq(int arr[], int n){
        boolean visited[] = new boolean[n];
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
            System.out.println(arr[i]+" "+count);
        }

    }
    public static void main(String[] args) {
        int arr[] = {10,20,10,30,40,10,50,20,30};
        countfreq(arr, arr.length);
    }
    
}
