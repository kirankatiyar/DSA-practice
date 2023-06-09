package LinkedList.Singlylinkedlist;
public class CountOfNodeInLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void countOfNode(){
        int c=0;
        Node curnode=head;
        while(curnode!=null){
            c++;
            curnode=curnode.next;
        }
        System.out.println("No of Nodes in this Linked_List is ="+c);
    }
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"  ");
            currNode=currNode.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        CountOfNodeInLinkedList refobj = new CountOfNodeInLinkedList();
        refobj.add(101);
        refobj.add(102);
        refobj.add(104);
        refobj.add(105);
        refobj.add(106);
        System.out.println("show list");
        System.out.println(" ");
        refobj.printList();
        System.out.println(" ");
        refobj.countOfNode();
    }
}
