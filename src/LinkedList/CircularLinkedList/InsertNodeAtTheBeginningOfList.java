package LinkedList.CircularLinkedList;
public class InsertNodeAtTheBeginningOfList {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void insertNodeBegin(String data){
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
            new_node.next=head;
            last.next=new_node;
            head=new_node;
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
        InsertNodeAtTheBeginningOfList refobj = new InsertNodeAtTheBeginningOfList();
        System.out.println("add new node in Circular linkedlist");
        refobj.insertNodeBegin("linked_list");
        refobj.displayList();
        System.out.println("\n"+"add another Nodes in Circular linked list");
        System.out.println("show Circular linked list");
        refobj.insertNodeBegin("circular");
        refobj.insertNodeBegin("a");
        refobj.insertNodeBegin("is");
        refobj.insertNodeBegin("this");
        refobj.displayList();

    }
}
