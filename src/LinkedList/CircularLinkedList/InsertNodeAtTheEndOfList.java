package LinkedList.CircularLinkedList;
public class InsertNodeAtTheEndOfList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insertNodeLast(int data){
        Node new_node = new Node(data);
        if(head==null){
            head=new_node;
            new_node.next=new_node;
        }
        else{
            Node last = head;
            while(last.next!=head){
                last=last.next;
            }
            last.next=new_node;
            new_node.next=head;
        }
    }
    public void displayList(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node temp = head;
            do{
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            while(temp!=head);
        }
    }
    public static void main(String[] args) {
        InsertNodeAtTheEndOfList refobj = new InsertNodeAtTheEndOfList();
        System.out.println("add new node in Circular linkedlist");
        refobj.insertNodeLast(2);
        refobj.displayList();
        System.out.println("\n"+"add another Nodes in Circular linked list");
        System.out.println("show Circular linked list");
        refobj.insertNodeLast(4);
        refobj.insertNodeLast(6);
        refobj.insertNodeLast(8);
        refobj.insertNodeLast(10);
        refobj.insertNodeLast(12);
        refobj.insertNodeLast(14);
        refobj.insertNodeLast(16);
        refobj.insertNodeLast(18);
        refobj.insertNodeLast(20);
        refobj.displayList();

    }
}
