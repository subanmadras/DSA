package DSA;
import java.util.*;
public class reverse_words_in_string {
    public static void main(String[] args) {
        String s = "My name is suban";
        s += " ";
        Stack<String> st = new Stack<String>();
        int i;
        String str = "";
        for( i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                st.push(str);
                str = "";
            }else{
                str += s.charAt(i);
            }
        }
        String ans = "";
        while(st.size() != 1){
            ans += st.peek() + " ";
            st.pop();
        }
        ans += st.peek();
        System.out.println();
        System.out.println(ans);
    }
    
}
