package DSA;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
} 
public class reverseLinkedlistUsingStack {
    static  Node reverse(Node head){
        Node temp = head;
        Node prev = null;
    
        while(temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
     static  void printlinkedlist(Node head){
        Node temp  = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head = reverse(head);
        printlinkedlist(head);

    }
    
}
