package Queue;
public class DequeueElementInQueueUsingArray {
    static int size;
    static int front;
    static int rear;
    static int[] arr;
    DequeueElementInQueueUsingArray(int n){
        this.size=n;
        this.front=0;
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
    public void dequeueElement(){
        if(front==rear){
            System.out.println("queue is empty");
            return;
        }
        else{
            int temp = arr[front];
            //displaying deleted element
            System.out.println("\n"+"dequeue element is:="+" "+temp);
            front++;
        }
    }
    public void displayQueue(){
        if(front==rear){
            System.out.println("queue is empty");
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+"  ");
            }
        }
    }
    public static void main(String[] args) {
        DequeueElementInQueueUsingArray refobj = new DequeueElementInQueueUsingArray(5);
        System.out.println("insert element in queue and show queue");
        refobj.enqueueElement(1);
        refobj.enqueueElement(2);
        refobj.enqueueElement(3);
        refobj.enqueueElement(4);
        refobj.enqueueElement(5);
        refobj.displayQueue();
        refobj.dequeueElement();
        refobj.displayQueue();

    }
}
