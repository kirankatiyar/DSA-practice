// Creating HashMap using java HashMap class to store the following pairs(person,age) and display them,Akash 21, Yash 16 ,Mohan 50,Rohan 66,kiran 31 & Lav 17
package HashMap;
import java.util.*;
public class JavaHashMapProgram {
    static void hashMapMethod(){
        //syntax : [HashMap<Key,Value> HashMapName = new HashMap<>();]
        HashMap<String,Integer> map = new HashMap<>();
        //Adding elements: by use .put() method
        map.put("Akash",21);
        map.put("Yash",16);
        map.put("Mohan",50);
        map.put("Rohan",66);
        map.put("Lav",17);
        map.put("Kiran",31);
        // Get all keys in the HashMap
        System.out.println(map.keySet());
        // Get all values in the HashMap
        System.out.println(map.values());
        // Get all entries in the HashMap
        System.out.println(map.entrySet());
        //Removing a pair from the HashMap
        System.out.println(map.remove("Kiran"));//if key is exist then,return keys value
        System.out.println(map.remove("Ram"));//if key is desn't exist then,return null
        System.out.println(map.entrySet());
        //Update value of key in the HashMap
        System.out.println(map.put("Yash",25));  //if key exists then its value is updated
        System.out.println(map.put("Priya",11));  //if key doesn't exists then return null value
        System.out.println(map.entrySet());
        //checking if a key is in the HashMap
        System.out.println(map.containsKey("kajal"));//if key doesn't exists then return false
        System.out.println(map.containsKey("Akash"));//if key is exist then,return true
    }
    public static void main(String[] args) {
        JavaHashMapProgram obj = new JavaHashMapProgram();
        obj.hashMapMethod();
    }
}
