package collectionframework.listinterface;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        System.out.println("Initial ArrayList: " + list);
        System.out.println("Size of ArrayList: " + list.size());
        list.add("b");
        list.add("a");
        list.add("c");
        list.add("d");
        System.out.println("Updated ArrayList: " + list);
        System.out.println("Size of ArrayList: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));
        list.remove("d");

    }
}
