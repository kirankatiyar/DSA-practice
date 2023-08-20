package Stack;
import java.util.Stack;
import java.util.Scanner;
public class CopyOneStackToAnotherStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        Stack<Integer> rt = new Stack<>();
        Stack<Integer> gt = new Stack<>();
        System.out.println("enter no , as many elements you wants insert into stack");
        int n = sc.nextInt();
        System.out.println("insert elements into stack");
        for(int i=1;i<=n;i++){
            int a = sc.nextInt();
            st.push(a);
        }
        System.out.println(st);
        while(st.size()>0){
            rt.push(st.pop());
        }
        while(rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println("copyed element in  same orderd");
        System.out.println(gt);
    }
}
