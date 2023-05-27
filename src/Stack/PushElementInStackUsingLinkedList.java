package Stack;
public class PushElementInStackUsingLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void pushElement(int data){
        Node new_node = new Node(data);
        if(head==null){
            head=new_node;
        }
        else{
            new_node.next=head;
            head=new_node;
        }
    }
    public void display(){
        if(head==null){
            System.out.println("stack is empty");
        }
        else{
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"  ");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        PushElementInStackUsingLinkedList refobj = new PushElementInStackUsingLinkedList();
        System.out.println("push element in stack");
        refobj.pushElement(10);
        System.out.println("show stack");
        refobj.display();
        refobj.pushElement(20);
        refobj.pushElement(30);
        refobj.pushElement(40);
        refobj.pushElement(50);
        refobj.display();

    }
}
