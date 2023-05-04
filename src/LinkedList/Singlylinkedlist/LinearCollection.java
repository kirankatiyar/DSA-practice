package LinkedList.Singlylinkedlist;
public class LinearCollection {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void add(String data){
        Node firstNode = new Node(data);
        if(head==null){
            head=firstNode;
        }
    }
    public void addFirstPosition(String data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void addLastPosition(String data){
        Node newNode1 = new Node(data);
        Node currNode;
        currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode1;
    }

    public void printList(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node t;
        t=head;
        while(t!=null){
            System.out.print(t.data+"-");
            t=t.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinearCollection refobj = new LinearCollection();
        System.out.println("show first Node");
        refobj.add("kiran");
        refobj.printList();
        refobj.addFirstPosition("is");
        refobj.printList();
        refobj.addFirstPosition("name");
        refobj.addFirstPosition("my");
        System.out.println("show list");
        refobj.printList();
        refobj.addLastPosition("katiyar");
        refobj.printList();
    }
}
