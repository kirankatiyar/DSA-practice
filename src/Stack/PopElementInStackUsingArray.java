package Stack;
public class PopElementInStackUsingArray {
    int size;
    int top;
    int[] arr ;
    PopElementInStackUsingArray(int given_size){
        this.size = given_size;
        this.top=-1;
        arr = new int[size];
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
    public int popElement(){
        if(top==-1){
            System.out.println("stack is empty");
            return -1;
        }
            int res = arr[top];
            top--;
        System.out.println(" popped element"+"="+res);
        return res;
    }
    public void displayStack(){
        if(top==-1)
            System.out.println("stack is empty");
        else{
            for(int i=top;i>=0;i--){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Array size is 5....");
        PopElementInStackUsingArray refobj = new PopElementInStackUsingArray(5);
        System.out.println("push element in stack");
        refobj.pushElement(100);
        refobj.pushElement(200);
        refobj.pushElement(300);
        refobj.pushElement(400);
        refobj.pushElement(500);
        System.out.println("display stack");
        refobj.displayStack();
        refobj.popElement();
        System.out.println("display stack after pop element");
        refobj.displayStack();




    }
}
