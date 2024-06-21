package DSA;
//import java.util.*;
class Node{
    int data;
    Node next, prev;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class DoubliLL{
    Node head;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        } 
        current.next = newNode;
        newNode.prev = current; 
    }

    //finding middle Node  of the LL
    public Node middleNode(){
        if(head == null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // method to display a LL
    public void display(){
        Node current = head;
        while(current != null){
           System.out.print(current.data+"->");
            current = current.next;
        }
        System.out.println("null");
    }
    //method to delete a last node
    public void deleteLast(){
        Node secLast = head;
        Node last = head.next;
        while(last.next != null){
            last = last.next;
            secLast = secLast.next;
        }
        last.next = null;
        secLast.prev = null;
    }

    //method to delete a node
    public void delete(Node del){
        if(head == null || del == null){
            return;
        }
        if(head == del){
            head = del.next;
        }
        if(del.next != null){
            del.next.prev = del.prev;
        }
        if(del.prev != null){
            del.prev.next = del.next;
        }

    }

    // method to reverse a LL
    public void reverse() {
        Node current = head;
        Node temp = null;
        while (current != null) {
            // Swapping next and prev pointers
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev; // Move to the next node
        }
        // Checking if list is not empty
        if (temp != null) {
            head = temp.prev;
        }
    }

    public static void main(String[] args) {
        DoubliLL list = new DoubliLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        //  Node delNode = list.head.next;
        //  list.delete(delNode);
         list.reverse();
        list.display();
        Node midNode = list.middleNode();
        System.out.println("middle node is: "+midNode.data);
    }
    
}
