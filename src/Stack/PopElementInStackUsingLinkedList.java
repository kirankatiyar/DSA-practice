package Stack;
public class PopElementInStackUsingLinkedList {
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
    public int popElement() {
        //Check for stack underflow..
        if (head == null) {
            System.out.println("stack is empty");
            return -1;
        }
        else {
            int top = head.data;
            head = head.next;
            System.out.println("top element is..." + top + "...which is popped");
            return top;

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
        PopElementInStackUsingLinkedList refobj = new PopElementInStackUsingLinkedList();
        System.out.println("push element in stack");
        refobj.pushElement(2);
        refobj.pushElement(4);
        refobj.pushElement(6);
        refobj.pushElement(8);
        refobj.pushElement(10);
        System.out.println("show stack");
        refobj.display();
        refobj.popElement();
        System.out.println("show stack");
        refobj.display();
    }
}
