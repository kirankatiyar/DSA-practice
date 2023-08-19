package Stack;
import java.util.Stack;
public class CopyOneStackToAnotherStackInREverseOrder {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        st.push('A');
        st.push('B');
        st.push('C');
        st.push('D');
        st.push('E');
        System.out.println("first stack\n"+st);
        Stack<Character> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        System.out.println(" Copy One Stack characters To Another Stack In REverse Order\n"+rt);
    }
}
