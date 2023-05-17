package LinkedList.Doublylinkedlist;
public class DoublyLinkedListAddNodeInBeginning {
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
    //add Node in Beginning
    public void addNodeAtFirst(int data){
        Node new_node = new Node(data);
        //add new node
        if(head==null){
            head = new_node;
            return;
        }
        //add First Node  in Beginning
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
        DoublyLinkedListAddNodeInBeginning refobj = new DoublyLinkedListAddNodeInBeginning();
        System.out.println("Add new node ...nd show Doubly linked list");
        refobj.addNodeAtFirst(300);
        refobj.displayList();
        System.out.println("add first Node in Beginning...And show Doubly linked list");
        refobj.addNodeAtFirst(200);
        refobj.displayList();

    }
}
