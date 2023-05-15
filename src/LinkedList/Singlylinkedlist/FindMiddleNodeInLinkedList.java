package LinkedList.Singlylinkedlist;
public class FindMiddleNodeInLinkedList {
    Node head;
    int size;
    //Without Argument Constructor of Class FindMiddleNodeInLinkedList
    FindMiddleNodeInLinkedList(){
        this.size=0;
    }
    //Node Class
    class Node{
        int data ;
        Node next;
        //Parameterize Constructor of Node Class
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void insertNode(int data){
        Node new_node = new Node(data);
        if(head==null){
            head=new_node;
            return;
        }
        Node tem = head;
        while(tem.next!=null){
            tem=tem.next;
        }
        tem.next=new_node;
    }
    public void displayList(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node current = head;
        while(current!=null){
            System.out.print(current.data+"   ");
            current=current.next;
        }
        System.out.println("null");
    }
    public int getSize(){
        return size;
    }
    public int getMiddleNode(){
        Node temp = head;
        Node slow , fast;
        slow=fast=head;
        if(head!=null){
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        }
        return -1;
    }
    public static void main(String[] args) {
        FindMiddleNodeInLinkedList refobj = new FindMiddleNodeInLinkedList();
        refobj.insertNode(2);
        refobj.insertNode(4);
        refobj.insertNode(6);
        refobj.insertNode(8);
        refobj.insertNode(10);
        refobj.insertNode(12);
        refobj.insertNode(14);
        refobj.insertNode(16);
        refobj.insertNode(18);
        refobj.insertNode(20);
        System.out.println("show list");
        refobj.displayList();
        System.out.println("size of list:="+refobj.getSize());
        System.out.println("middle node of list is:="+refobj.getMiddleNode());




    }
}
