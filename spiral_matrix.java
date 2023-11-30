package DSA;
import java.util.*;
public class spiral_matrix {
    static ArrayList<Integer> spiral_mat(int mat[][]){
        ArrayList<Integer> ans  = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;
        
        int top = 0, left = 0, bottom = n-1, right = m-1;
        while(top<=bottom && left<=right){
            for(int i=left; i<=right; i++)
                ans.add(mat[top][i]);
                top++;

            for(int i=top; i<=bottom; i++)
                ans.add(mat[i][right]);
                right--;

            if(top<=bottom){
                    for(int i=right; i>=left; i--)
                        ans.add(mat[bottom][i]);
                        bottom--;   
                }

                if(left<=right){
                    for(int i=bottom; i>=top; i--)
                        ans.add(mat[i][left]);
                        left++;
                }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}, {13, 14, 15, 16}};
        ArrayList<Integer> list = spiral_mat(arr);
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
    
}
