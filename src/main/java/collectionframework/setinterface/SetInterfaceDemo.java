package collectionframework.setinterface;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceDemo {
    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add(10);
        set.add(20);
        set.add(5);
        set.add(30);
        set.add(10); // Duplicate values are ignored
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("Size of the set: " + set.size());
        System.out.println("Contains 20: " + set.contains(20));
        System.out.println("Contains 35: " + set.contains(35));
        System.out.println("Is set empty? " + set.isEmpty());

    }
}
