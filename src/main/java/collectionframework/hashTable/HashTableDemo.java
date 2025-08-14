package collectionframework.hashTable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Map map = new Hashtable();
        Enumeration names;
        String string;
        map.put("Kunal", 1235.87896D);
        map.put("key2", 3.14d);
        map.put("key3", 678.90123d);
        map.put("key4", 987.65432d);
        map.put("key5", 456.78901d);

        // Show all balances in the Hashtable
        names = ((Hashtable<String, Double>) map).keys();

        // Iterate over the keys and print the balances
        while (names.hasMoreElements()) {
            string = (String) names.nextElement();
            System.out.println("Name: " + string + ", Balance: " + map.get(string));
        }

        // Remove a key-value pair
        map.remove("key2");

        // Show all balances after removing a key-value pair
        names = ((Hashtable<String, Double>) map).keys();
        System.out.println("\nBalances after removing 'key2':");
        while (names.hasMoreElements()) {
            string = (String) names.nextElement();
            System.out.println("Name: " + string + ", Balance: " + map.get(string));
        }

       double balance = (Double)map.get("Kunal");
        map.put("Kunal", balance + 1000.0);
        System.out.println("\nBalances after adding 1000 to 'Kunal':" + map.get("Kunal"));
    }
}
