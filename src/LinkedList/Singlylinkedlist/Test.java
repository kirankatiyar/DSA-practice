package LinkedList.Singlylinkedlist;
public class Test {
    Node head;
    int size;
    Test(){
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
    public void insertAtPosition(int pos,String data){
        Node new_node = new Node(data);
        if(pos<1|| pos>size+1){
            System.out.println("invalid position , insertion not possible at this position");
        }

            else if(pos==1){
                new_node.next=head;
                head=new_node;
            }
        else {
            Node temp = head;
            for(int i=1;i<=pos-1;i++){
                temp=temp.next;
            }
            new_node.next=temp.next;
            temp.next=new_node;
        }
    }
    public void displayList(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.insertNode("node_n1");
        obj.insertNode("node_n2");
        obj.insertNode("node_n3");
        obj.insertNode("node_n4");
        System.out.println("show original list");
        obj.displayList();
        System.out.println("size of list:= "+obj.getSize());
        obj.insertAtPosition(3,"node_p");
        System.out.println("show list after insertion at given position");
        obj.displayList();
        System.out.println("size of list:= "+obj.getSize());
    }
}
