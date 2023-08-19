package HashMap;
import java.util.HashMap;
import java.util.Scanner;
public class JavaHashMapProgram2 {
    public static void main(String[] args) {
        HashMap<String, String> hmap = new HashMap<>();
        Scanner sn = new Scanner(System.in);
        System.out.println("enter your String");
            String a = sn.next();
            String b = sn.next();
            hmap.put(a , b);
            System.out.print(hmap.entrySet());

        }
    }