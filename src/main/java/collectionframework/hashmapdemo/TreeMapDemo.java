package collectionframework.hashmapdemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        // Specify the types for the TreeMap
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("key1", "value1");
        treeMap.put("key2", "value2");
        treeMap.put("key3", "value3");
        treeMap.put("key4", "value4");
        treeMap.put("key5", "value5");
        System.out.println("Original Map: " + treeMap);
        System.out.println("Size of Map: " + treeMap.size());

        // Get a set of entries
        Set set = treeMap.entrySet();

        // Iterate over the set using Iterator
        Iterator itr = set.iterator();

        // Display elements
        while (itr.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) itr.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Sorting the map based on keys
        System.out.println("Sorted Map by Keys:");
        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }

        // Sorting the map based on values
        System.out.println("Sorted Map by Values:");
        for (String value : treeMap.values()) {
            System.out.println("Value: " + value + ", Key: " + treeMap.entrySet().stream()
                    .filter(e -> e.getValue().equals(value))
                    .map(e -> e.getKey())
                    .findFirst()
                    .orElse(null));
        }

        // Removing an entry
        treeMap.remove("key2");
    }
}


