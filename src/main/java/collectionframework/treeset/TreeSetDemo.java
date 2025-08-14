package collectionframework.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(5);
        treeSet.add(30);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("Minimum element: " + treeSet.first());
        System.out.println("Maximum element: " + treeSet.last());
        System.out.println("Size of TreeSet: " + treeSet.size());
        Iterator<Integer> itr = treeSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        if(treeSet.remove(30)){
            System.out.println("Removed element: 30");
        }else{
            System.out.println("Element not found to remove: 30");
        }
        System.out.println("Data destructure after removing 30: " + treeSet);
        itr = treeSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());
        System.out.println("TreeSet after adding 40: " + treeSet.add(40));
        treeSet.clear();
        System.out.println("TreeSet is empty after clearing: " + treeSet.isEmpty());
    }
}
