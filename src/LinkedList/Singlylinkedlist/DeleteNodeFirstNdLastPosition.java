package LinkedList.Singlylinkedlist;
public class DeleteNodeFirstNdLastPosition {
    Node head;
    int size;
    DeleteNodeFirstNdLastPosition(){
        this.size=0;
    }
    //Node class
    class Node{
        String data;
        Node next;
        //Parameterized Constructor
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void insertNode(String data){
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
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+"   ");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public int getSize(){
        return size;
    }
    //At First Position
    public void deleteAtFirst(){
        if(head==null){
            System.out.println("list is empty");
        }
        head=head.next;
        size--;
    }
    //At Last Position
    public void deleteAtLast(int pos){
        if(head==null){
            System.out.println("list is empty");
        }
        Node prev = head;
        for(int i=1;i<=pos-1;i++){
            prev = prev.next;
        }
        prev.next=prev.next.next;
        size--;
    }

    public static void main(String[] args) {
        DeleteNodeFirstNdLastPosition obj = new DeleteNodeFirstNdLastPosition();
        obj.insertNode("Mathematics");
        obj.insertNode("Physics");
        obj.insertNode("Chemistry");
        obj.insertNode("English");
        obj.insertNode("Hindi");
        System.out.println("show original list");
        obj.displayList();
        System.out.println("size of list:= "+obj.getSize());
        obj.deleteAtFirst();
        System.out.println("show list after performing delete opration at First position");
        obj.displayList();
        System.out.println("size of list:= "+obj.getSize());
        obj.deleteAtLast(3);
        System.out.println("show list after performing delete opration at last position");
        obj.displayList();
        System.out.println("size of list:= "+obj.getSize());

    }
}


