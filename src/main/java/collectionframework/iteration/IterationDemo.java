package collectionframework.iteration;

import java.util.Iterator;
import java.util.LinkedList;

public class IterationDemo {
    public static void main(String[] args) {
        // Create an array of integers
        int[] arr = {1, 2, 3, 4, 5};

        // Iterate over the array using a for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Iterate over the array using a for-each loop
        for (int num : arr) {
            System.out.println(num);
        }

        // Create a linked list of integers
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Iterate over the linked list using a for-each loop
        for (int num : list) {
            System.out.println(num);
        }

        Iterator itr = list.iterator();

        // Iterate over the linked list using an Iterator
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Iterate over the linked list using a for loop

        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element);
        }

        System.out.println("List size: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());
        list.remove(3);

        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element);
        }

        while(itr.hasNext()) {
          Object element = itr.next();
          System.out.println(element);
        }
    }
}
