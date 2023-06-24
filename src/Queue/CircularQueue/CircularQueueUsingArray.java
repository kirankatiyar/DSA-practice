package Queue.CircularQueue;
public class CircularQueueUsingArray {
    static int size;
    static int front;
    static int rear;
    static int[] arryy;
    //constructer
    CircularQueueUsingArray(int n){
        this.size=n;
        this.front=-1;
        this.rear=-1;
        arryy = new int[size];
    }
    // Adding an element
    public void enqueue(int data){
        if((rear+1)%size==front){
            return;
        }
        if(front==-1){
            front=0;
        }
            rear=(rear+1)%size;
            arryy[rear]=data;
    }
    //Remove element
    public int dequeue(){
        if(front==-1&&rear==-1){
            return -1;
        }
        int temp = arryy[front];
        if(front==rear){
            front=rear=-1;
        }
        else{
            front=(front+1)%size;
        }
        return temp;
    }
    //display status of Circular Queue
    public void displayQueue(){
        int i;
        if(front==-1&&rear==-1){
            System.out.println("queue is empty");
        }
       for(i=front;i!=rear;i=(i+1)%size){
           System.out.print(arryy[i]+" ");
       }
        System.out.print(arryy[i]+" ");
    }
    public static void main(String[] args) {
        int tem;
        CircularQueueUsingArray refobj = new CircularQueueUsingArray(5);
        System.out.println("insert element in queue and show queue");
        refobj.enqueue(10);
        refobj.enqueue(100);
        refobj.enqueue(1000);
        refobj.enqueue(20);
        refobj.enqueue(30);
        refobj.displayQueue();
        System.out.println("\n"+"dequeue element and show queue");
        tem=refobj.dequeue();
        tem=refobj.dequeue();
        refobj.displayQueue();
        System.out.println("\n"+"enqueue element and show queue");
        refobj.enqueue(14);
        refobj.enqueue(15);
        refobj.displayQueue();
    }
}
