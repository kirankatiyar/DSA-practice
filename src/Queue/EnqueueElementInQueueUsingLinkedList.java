package Queue;
public class EnqueueElementInQueueUsingLinkedList {
    Node front;
    Node rear;
    EnqueueElementInQueueUsingLinkedList(){
        this.front=null;
        this.rear=null;
    }

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insertElement(int data){
        Node new_node = new Node(data);
        if(front==null&&rear==null){
            front=rear=new_node;
        }
        else{
            rear.next=new_node;
            rear=new_node;
            rear.next=null;
        }
    }
    public void displayQueue(){
        if(front==null&&rear==null){
            System.out.println("queue is empty");
        }
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        EnqueueElementInQueueUsingLinkedList refobj = new EnqueueElementInQueueUsingLinkedList();
        System.out.println("enter element in queue and show queue");
        refobj.insertElement(10);
        refobj.insertElement(20);
        refobj.insertElement(30);
        refobj.insertElement(40);
        refobj.insertElement(50);
        refobj.displayQueue();

    }
}
