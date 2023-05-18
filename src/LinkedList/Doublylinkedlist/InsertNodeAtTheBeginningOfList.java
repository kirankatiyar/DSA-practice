package LinkedList.Doublylinkedlist;
public class InsertNodeAtTheBeginningOfList {
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;
       //parameterize constructor
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    // insert newnode at Beginning
    public void insertNodeAtFirst(int data){
        Node new_node = new Node(data);
        // insertn new node
        if(head==null){
            head = new_node;
            return;
        }
        //insert Node at  Beginning
        else {
            new_node.next = head;
            head.prev = new_node;
            new_node.prev = null;
        }  head=new_node;
    }
    public void displayList(){
        if(head==null){
            System.out.println("Doubly linked list is empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("-->null");
    }
    public static void main(String[] args) {
        InsertNodeAtTheBeginningOfList refobj = new InsertNodeAtTheBeginningOfList();
        System.out.println("Add new node ...nd show Doubly linked list");
        refobj.insertNodeAtFirst(300);
        refobj.displayList();
        System.out.println("add first Node at Beginning...And show Doubly linked list");
        refobj.insertNodeAtFirst(200);
        refobj.displayList();

    }
}
