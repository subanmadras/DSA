package DSA;
import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}
public class search_an_ele_in_LL {
    static boolean checkIfPresent(Node head, int val){
        Node temp = head;
        while(temp != null){
            if(temp.data == val){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);

        int val = 4;

        System.out.println(checkIfPresent(head, val));
    }
    
}
