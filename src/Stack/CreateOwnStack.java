package Stack;
import java.util.Scanner;
import java.util.Stack;
public class CreateOwnStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("size of stack is:"+"   "+  st.size());
        System.out.println("stack is empty..?:");
        System.out.println(st.isEmpty());
        System.out.println("enter no , as many elements you wants insert into stack");
        int n = sc.nextInt();
        System.out.println("insert elements into stack");
        for(int i=1;i<=n;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println("my own stack is created");
        System.out.println(st);
        System.out.println("size of stack is:"+ " " + st.size());
    }
}
