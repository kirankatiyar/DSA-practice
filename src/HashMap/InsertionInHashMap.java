package HashMap;
import java.util.HashMap;
public class InsertionInHashMap {
    public static void main(String[]args){
        // create a hashmap
        //country(key),population(value);
        HashMap<String,Integer> countryInfo = new HashMap<>();
        // add elements to hashmap
        countryInfo.put("India",130);
        countryInfo.put("Switzerland",130);
        countryInfo.put("london",89);
        countryInfo.put("America",33);
        System.out.println("show countries name and their population");
        System.out.println(countryInfo);
    }
}
