package Stack;
public class PeekElementInStackUsingArray {
    int size;
    int top;
    int[] a;
    PeekElementInStackUsingArray(int arr_size){
        this.size=arr_size;
        this.top=-1;
        a = new int[size];
    }
    public void pushElement(int data){
        if(top==size-1){
            System.out.println("stack is full");
        }
        else{
            top++;
            a[top]=data;
        }
    }
    public int peekElement(){
        int result = a[top];
        return result;
    }
    public void popElement(){
        int res = a[top];
        top--;
        System.out.println("popped element is: "+" "+res);
    }
    public void displayStack(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
            for(int i=top;i>=0;i--){
            System.out.print(a[i]+",");
            }
        }
    }
    public static void main(String[] args) {
        PeekElementInStackUsingArray  refobj = new PeekElementInStackUsingArray(5);
        System.out.println("push element in stack & show stack");
        refobj.pushElement(5);
        refobj.pushElement(4);
        refobj.pushElement(3);
        refobj.pushElement(2);
        refobj.pushElement(1);
        refobj.displayStack();
        System.out.println("\n"+refobj.peekElement()+" "+"is top most element");
        refobj.popElement();
        System.out.println("show stack element after pop opration");
        refobj.displayStack();
    }
}
