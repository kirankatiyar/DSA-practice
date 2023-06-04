package Queue;
public class DequeueElementInQueueUsingLinkedList {
    Node front;
    Node rear;
    DequeueElementInQueueUsingLinkedList(){
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
    public void removeElement(){
        if(front==null){
            System.out.println("queue is empty");
        }
        else{
            Node res=front;
            int curr = front.data;
            System.out.println("remove element is :="+"  "+curr);
            front=front.next;
            //when we delete last element
            if(front==rear){
                rear=null;
            }
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
        DequeueElementInQueueUsingLinkedList refobj = new DequeueElementInQueueUsingLinkedList();
        System.out.println("enter element in queue and show queue");
        refobj.insertElement(25);
        refobj.insertElement(26);
        refobj.insertElement(27);
        refobj.insertElement(28);
        refobj.insertElement(29);
        refobj.displayQueue();
        refobj.removeElement();
        refobj.displayQueue();


    }
}
