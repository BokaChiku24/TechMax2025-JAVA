package collectionframework.setinterface;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortedSet {
    public static void main(String[] args) {
        Set sortedSet = new TreeSet();
        sortedSet.add("b");
        sortedSet.add("a");
        sortedSet.add("c");
        System.out.println("Sorted Set: " + sortedSet);
        System.out.println("First Element: " + ((TreeSet<String>) sortedSet).first());
        Iterator<String> itr = sortedSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
