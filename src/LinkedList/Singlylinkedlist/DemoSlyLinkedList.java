//Add First Node...
package LinkedList.Singlylinkedlist;
public class DemoSlyLinkedList {
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
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
        }
    }
    public void viewList(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node t;
        t=head;
        while(t!=null){
            System.out.print(t.data+"-");
            t=t.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        DemoSlyLinkedList obj = new DemoSlyLinkedList();
        obj.add(100);
        obj.viewList();
    }
}

