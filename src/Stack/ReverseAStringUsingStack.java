package Stack;
import java.util.*;
public class ReverseAStringUsingStack {
    public static String reverse(String str) {
        // create an empty stack of characters
        Stack<Character> stack = new Stack<Character>();
        //convert String into character array
        char[] chrr = str.toCharArray();
        // push every character of the char Array into the stack
        for(int i=0;i<chrr.length;i++){
            stack.push(chrr[i]);
        }
        // pop every characters from the stack and assign each popped character back to the character array
        for(int i=0;i<chrr.length;i++){
            chrr[i]=stack.pop();
        }
        //convert CharArray into String by using valoOf() method
        //create an object of String class
        String strr = new String();
        String newstr = strr.valueOf(chrr);
        System.out.println("reverse String");
        System.out.println(newstr);
        return newstr;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ReverseAStringUsingStack refobj = new ReverseAStringUsingStack();
        System.out.println("enter your String");
        String str=s.next();
        refobj.reverse(str);
    }
}
