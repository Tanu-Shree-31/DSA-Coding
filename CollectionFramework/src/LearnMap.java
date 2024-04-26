import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class LearnMap {
    public static void main(String[] args) {
        //Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map = new TreeMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);

//        if(!map.containsKey("Two")){
//            map.put("Two", 23);
//        }

        System.out.println(map.containsValue(3));

        System.out.println(map.isEmpty());

        map.putIfAbsent("Two", 23);
        System.out.println(map);

        // iterate for all the key-value pair
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();
        }

        //iterate only for key
        for(String key: map.keySet()){
            System.out.println(key);
        }

        System.out.println();

        //iterate only for values
        for(Integer value: map.values()){
            System.out.println(value);
        }

        map.remove("Three");

        map.clear();

    }
}
