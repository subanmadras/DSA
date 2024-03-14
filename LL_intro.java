package DSA;
import java.util.*;
public class LL_intro {
    Node head;
    private int size;
    LL_intro(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    // To add at First
    public void addFirst(String  data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // To add at last
    public  void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next  != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    //To print a list
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
        } 
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    //To delete at First
    public void delete_first(){
        if(head == null){
            System.out.println("list is empty");
        }
        size--;
        head =head.next;
    }
    //To delete at Last
    public void delete_last(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secLastNode = head;
        Node LastNode = head.next;
        while(LastNode.next != null){
            LastNode = LastNode.next;
            secLastNode = secLastNode.next;
        }
        secLastNode.next = null;
    }
   public int getSize(){
    return size;
   }
    public static void main(String[] args) {
        LL_intro list = new LL_intro();

        list.addFirst("suban");
        list.addFirst("madras");
        list.addLast("mujawar");

        list.printList();
        // list.delete_first();
        list.delete_last();
        System.out.println(list.getSize());
        list.printList();
    }   
}
