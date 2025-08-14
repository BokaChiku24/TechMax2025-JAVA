package collectionframework.listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a LinkedList
        List<String> list = new ArrayList<String>();

        // Add elements to the LinkedList
        list.add("b");
        list.add("a");
        list.add("c");
        list.add("d");

        // Print the LinkedList
        System.out.println("Linked List: " + list);

        // Access elements using index
        System.out.println("Element at index 1: " + list.get(1));

        // Remove an element
        list.remove(1);

        // Print the updated LinkedList
        System.out.println("Updated Linked List: " + list);

        // Reverse the LinkedList
        Collections.reverse(list);

        // Print the reversed LinkedList
        System.out.println("Reversed Linked List: " + list);

        // Add an element at a specific index
        list.add(1, "e");

        // Print the updated LinkedList
        System.out.println("Updated Linked List with added element: " + list);

        // Check if the LinkedList contains an element
        System.out.println("Element present in the LinkedList: " + list.contains("p"));

        list.removeLast();
        System.out.println("Updated Linked List after removing last element: " + list);

        // get and set value at a specific index
        Object val = list.get(2);
        list.set(2, "f");
        System.out.println("Value at index 2: " + val);

    }
}
