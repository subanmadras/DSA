package DSA;
import java.util.*;
public class recursion {
    static void revArr(int arr[], int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            revArr(arr, start + 1, end - 1);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        revArr(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));
    }
}
