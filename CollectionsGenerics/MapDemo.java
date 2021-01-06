
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("myName", "Navin");/// (  KEY,   VALUE  )
        map.put("Actor", "John");
        map.put("Ceo", "Prasad");
        map.put("Ceo", "dhiroj");        //repeat hi nahi hoga, it will replace the previous value
        // we can repeat values but not keys

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + "  " +map.get(key));       // to get output in desired style
        }

        System.out.println(map);  //to get the full table
        System.out.println(map.get("Actor"));   // case sensitive hai    // to gt op for a special key


    }
}
