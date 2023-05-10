package LinkedList.Singlylinkedlist;
public class ReverseInLinkedList {
    Node head;
    int size;
    ReverseInLinkedList(){
        this.size=0;
    }

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void insertion(int data){
        Node new_node = new Node();
        if(head==null){
        head=new_node;
        return;
        }
        Node t = head;
        while(t.next!=null){
            t=t.next;
        }
        t.next=new_node;
    }
    public void displayList(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public void reverseList(){
        Node curr = head;
        Node prvs;
        Node temp ;
        while(curr!=null){
            temp = curr.next;
            curr.next = prvs;
            prvs = curr;
            curr = temp;
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        ReverseInLinkedList refobj = new ReverseInLinkedList();
        refobj.insertion(1);
        refobj.insertion(2);
        refobj.insertion(3);
        refobj.insertion(4);
        refobj.insertion(5);
        System.out.println(" show list");
        refobj.displayList();
        refobj.reverseList();
        System.out.println("show list");
        refobj.displayList();

    }
}
