package collectionframework.hashmapdemo;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        map.put("key5", "value5");

        System.out.println("Original Map: " + map);
        System.out.println("Size of Map: " + map.size());
        System.out.println("Value for key 'key2': " + map.get("key2"));
        map.remove("key3");
        System.out.println("Updated Map: " + map);
        System.out.println("Size of Map after removing an element: " + map.size());
        System.out.println("Checking if Map contains key 'key6': " + map.containsKey("key6"));
        System.out.println("Checking if Map contains value 'value4': " + map.containsValue("value4"));

        // Get a set of keys from the Map
        Set set = map.entrySet();

        // Iterate over the set using Iterator
        System.out.println("Entries in Map:");
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
