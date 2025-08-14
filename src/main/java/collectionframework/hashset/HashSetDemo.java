package collectionframework.hashset;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet map = new HashSet();

        // Add elements to the HashSet
        map.add("b");
        map.add("a");
        map.add("c");
        map.add("d");

        System.out.println("HashSet: " + map);
        System.out.println("Size of HashSet: " + map.size());
        System.out.println("Element at index 1: " + map.toArray()[1]);
        map.remove("d");

        System.out.println("Updated HashSet: " + map);
        System.out.println("Size of HashSet after removing an element: " + map.size());
        System.out.println("Checking if HashSet contains an element: " + map.contains("p"));

        // Iterate over the HashSet using Iterator
        System.out.println("Elements in HashSet:");
        for (Object obj : map) {
            System.out.println(obj);
        }

        // Convert HashSet to an array
        Object[] array = map.toArray();
        System.out.println("Array from HashSet:");
        for (Object obj : array) {
            System.out.println(obj);
        }
    }
}
