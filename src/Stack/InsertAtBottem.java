package Stack;
import java.util.Stack;
import java.util.Scanner;
public class InsertAtBottem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        Stack<Integer> rt = new Stack<>();
        System.out.println("enter no , as many elements you want insert");
        int n = sc.nextInt();
        System.out.println("enter element in stack");
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        while(st.size()>0){
            rt.push(st.pop());
        }
        System.out.println("stack is empty"+" "+st);
        System.out.println("enter that element which you want insert at bottem in stack");
        int e = sc.nextInt();
        st.push(e);
        System.out.println(st);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.print(st);

    }
}
