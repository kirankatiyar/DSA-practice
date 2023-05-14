package LinkedList.Singlylinkedlist;
public class EmptyLinkedList {
    Node head;
    int size;
    //Without Argument Constructor of Class GetNthNodeInLinkedList
    EmptyLinkedList(){
        this.size=0;
    }
    //Node Class
    class Node{
        int data;
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
            //head=new_node;
            return;
        }
    }
    public void displayList(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node tempry = head;
        while(tempry!=null){
            System.out.print(tempry.data+" ");
            tempry=tempry.next;
        }
    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        EmptyLinkedList refobj = new EmptyLinkedList();
        refobj.insertNode(5);
        refobj.displayList();
        System.out.println("size of list is:="+refobj.getSize());

    }
}
