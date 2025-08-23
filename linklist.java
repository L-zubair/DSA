
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
    public class linklist {
    public static void main(String[] args) {
    //creatting node
    Node head = new Node(10);
    Node second = new Node(20);
    Node third = new Node(30);
    //linking
    head.next=second;
    second.next=third;
    //Traverse and print 
    Node current=head;
    while (current != null) {
        System.out.println(current.data+"->");
        current=current.next;
        
    }
    System.out.println("null");
}
        
    }

