package DSA;
import java.util.*;
public class remove_outermost_parenthesis {
        public static String removeOuterParentheses(String s) {
            StringBuilder result = new StringBuilder();
            int openCount = 0;
    
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    if (openCount > 0) {
                        result.append(c);
                    }
                    openCount++;
                } else if (c == ')') {
                    openCount--;
                    if (openCount > 0) {
                        result.append(c);
                    }
                }
            }
    
            return result.toString();
        }
    
        public static void main(String[] args) {
            String input1 = "(()())(())";
            String input2 = "(()())(())(()(()))";
    
            System.out.println("Input 1: " + removeOuterParentheses(input1));
            System.out.println("Input 2: " + removeOuterParentheses(input2));
        }
    }
