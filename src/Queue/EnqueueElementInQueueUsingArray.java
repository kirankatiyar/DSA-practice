package Queue;
public class EnqueueElementInQueueUsingArray {
    int size;
    int front;
    int rear;
    int[] arr;
    EnqueueElementInQueueUsingArray(int n){
        this.size=n;
        this.front=-1;
        this.rear=-1;
        arr = new int[size];
    }
    public void enqueueElement(int data){
        if(rear==size-1){
            System.out.println("queue is full");
        }
        else{
            rear++;
            arr[rear]=data;
        }
    }
    public void displayQueue(){
        if(front==rear){
            System.out.println("queue is empty");
        }
        else{
            for(int i=0;i<=size-1;i++){
                System.out.print(arr[i]+"  ");
            }
        }
    }
    public static void main(String[] args) {
        EnqueueElementInQueueUsingArray refobj = new EnqueueElementInQueueUsingArray(5);
        System.out.println("insert element in queue and show queue");
        refobj.enqueueElement(1);
        refobj.enqueueElement(2);
        refobj.enqueueElement(3);
        refobj.enqueueElement(4);
        refobj.enqueueElement(5);
        refobj.displayQueue();

    }
}
