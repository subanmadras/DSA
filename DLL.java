package DSA;

class Node{
    Node next,prev; 
    int data;
    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class DLL {
     Node head;
    public void insert(int data){
       Node newnode= new Node(data);
       if(head == null){
           head = newnode;
           return;
       }
       Node currnode = head;
       while(currnode.next != null){
           currnode= currnode.next;
       }
       currnode.next = newnode;
       newnode.prev = currnode;
    }
    //function to delete last node
    public void deletelastnode(){
        Node lastnode =head.next;
        Node lastsec = head;
        while(lastnode.next != null){
            lastnode = lastnode.next;
            lastsec = lastsec.next;
        }
        lastsec.next = null;
        lastnode.prev = null;
    }
    // function to reverse a list
    public void reverselist(){
        Node current = head;
        Node temp = null;
        while(current != null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        // this will help us to traverse throught the list from last to first
        if(temp != null){
            head = temp.prev;
        }
    }
    //function to find middle node
    public Node middlenode(){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null && slow != null){
            fast = fast.next.next;
            slow= slow.next;
        }
        return slow;
    }
    //method to delete a particular node
    public void delete_particular(Node del){
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
    // function to print list
    public void printlist(){
        Node currnode = head;
        while(currnode!= null){
            System.out.print(currnode.data+"->");
            currnode= currnode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.deletelastnode();
        Node middleNode = list.middlenode();
        System.out.println("middle node is "+ middleNode.data);
        list.deletelastnode();
        list.reverselist();
        list.printlist();
        
    }
}  

