package Stack;
public class PushElementInStackUsingArray {
    int size;
    int top;
    int[] arr;
    PushElementInStackUsingArray(){
        this.top=-1;
        this.size=3;
        arr  = new int[size];
    }
    public void pushElement(int data){
        if(top==size-1){
            System.out.println("stack is full");
        }
        else {
                top++;
                arr[top] = data;
        }
    }
    public void display(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else {
            for (int i = top; i>=0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        PushElementInStackUsingArray refobj = new PushElementInStackUsingArray();
        System.out.println("push element in stack");
        refobj.pushElement(10);
        refobj.pushElement(20);
        refobj.pushElement(30);
        System.out.println("display stack element");
        refobj.display();
    }
}
