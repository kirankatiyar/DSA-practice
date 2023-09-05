package Stack;
import java.util.Stack;
import java.util.Scanner;
public class InsertAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stc = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        System.out.println("enter no , as many elements you want insert in stack");
        int n = sc.nextInt();
        System.out.println("insert element in stack");
        for(int i=1;i<=n;i++){
            int x = sc.nextInt();
            stc.push(x);
        }
        System.out.println(stc);
        System.out.println("enter that index in which you want insert element");
        int indx = sc.nextInt();
        System.out.println("enter that element which you want insert ");
        int elm = sc.nextInt();
        while(stc.size()>=indx){
            temp.push(stc.pop());
        }
        stc.push(elm);
        System.out.println(stc);
        while(temp.size()>=1){
            stc.push(temp.pop());
        }
        System.out.println(stc);
    }
}
