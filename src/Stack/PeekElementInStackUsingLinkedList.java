package Stack;
public class PeekElementInStackUsingLinkedList {
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
    public int peekElement(){
        if(head==null){
            return -1;
        }
        else{
        int temp = head.data;
        return temp;
        }
    }
    public void popElement(){
        if(head==null){
            System.out.println("stack is empty");
        }
        else{
            int retn = head.data;
            head=head.next;
            System.out.println("popped element is: "+" "+retn);
        }
    }
    public void displayStack(){
        if(head==null){
            System.out.println("stack is empty");
        }
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+"  ");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        PeekElementInStackUsingLinkedList refobj = new PeekElementInStackUsingLinkedList();
        System.out.println("push element in stack & show stack");
        refobj.pushElement(50);
        refobj.pushElement(40);
        refobj.pushElement(30);
        refobj.pushElement(20);
        refobj.pushElement(10);
        refobj.displayStack();
        System.out.println("\n"+refobj.peekElement()+" "+"is top most element");
        refobj.popElement();
        System.out.println("show stack element after pop opration");
        refobj.displayStack();
    }
}
