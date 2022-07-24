
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> hashmap = new HashMap<>();
        
        hashmap.put("matthew", "matt");
        hashmap.put("michael", "mix");
        hashmap.put("arthur", "artie");
        
        System.out.println(hashmap.get("matthew"));
    }
}
