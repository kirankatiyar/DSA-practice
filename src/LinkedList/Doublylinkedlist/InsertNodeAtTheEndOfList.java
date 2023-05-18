package LinkedList.Doublylinkedlist;
public class InsertNodeAtTheEndOfList {
    Node head;
    class Node{
        String data;
        Node next;
        Node prev;
        //Parameterize constructor..
        Node(String data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public void insertInBegin(String data){
        Node new_node = new Node(data);
        if(head==null){
            head=new_node;
            return;
        }
        else{
            new_node.prev=null;
            new_node.next=head;
            head.prev=new_node;
            head=new_node;
        }
    }
    public void insertInEnd(String data){
        Node new_node = new Node(data);
        if(head==null){
            head=new_node;
        }
        else{
            Node curr = head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=new_node;
            new_node.prev=curr;
            new_node.next=null;
        }
    }
    public void displayList(){
        if(head==null){
            System.out.println("Doubly linked list is empty ");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.print("->null");
        }
    }
    public static void main(String[] args) {
        InsertNodeAtTheEndOfList refobj = new InsertNodeAtTheEndOfList();
        System.out.println("we have Doubly linked list with One new_node");
        refobj.insertInBegin("song4");
        refobj.displayList();
        System.out.println("\n"+"add another Nodes in Doubly linked list");
        refobj.insertInBegin("song3");
        refobj.insertInBegin("song2");
        refobj.insertInBegin("song1");
        refobj.displayList();
        System.out.println("\n"+"add Nodes at End of Doubly linked list");
        refobj.insertInEnd("song5");
        refobj.insertInEnd("song6");
        refobj.insertInEnd("song7");
        refobj.displayList();
    }
}
