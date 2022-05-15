package collections.mapscollection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Implementations {

    public static void main(String[] args) {
        linkedHashMap();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        hashtables();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        hashMaps();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    public static LinkedHashMap<String, String> link;
    public static Hashtable<Integer, String> hash_table;
    public static HashMap<String, String> hashmap;

    public static void linkedHashMap() {

        /*
         * A LinkedHashMap contains values based on the key. It implements the Map
         * interface and extends the HashMap class. It contains only unique elements. It
         * may have one null key and multiple null values. It is non-synchronized. It is
         * the same as HashMap with an additional feature that it maintains insertion
         * order. For example, when we run the code with a HashMap, we get a different
         * order of elements.
         */

        // Creating an empty LinkedHashMap
        link = new LinkedHashMap<String, String>();

        // Adding entries in Map using put() method
        link.put("one", "Barcelona");
        link.put("two", "Real Madrid");
        link.put("three", "Manchester");

        // Printing all entries inside Map
        System.out.println(link);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        // Note: It prints the elements in same order as they were inserted

        // Getting and printing value for a specific key
        System.out.println("Getting value for key 'one': " + link.get("one"));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        // Getting size of Map using size() method
        System.out.println("Size of the map: " + link.size());
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        // Checking whether Map is empty or not
        System.out.println("Is map empty? " + link.isEmpty());
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        // Using containsKey() method to check for a key
        System.out.println("Contains key 'two'? " + link.containsKey("two"));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        // Removing entry using remove() method
        System.out.println("delete element 'one': " + link.remove("one"));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        // Printing mappings to the console
        System.out.println("Mappings of LinkedHashMap : " + link);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }
    public static void hashtables() {
        // Creating an empty HashTable
        hash_table = new Hashtable<Integer, String>();

        // Inserting elements into the table
        hash_table.put(10, "London");
        hash_table.put(15, "Algiers");
        hash_table.put(20, "Paris");
        hash_table.put(25, "washington");
        hash_table.put(30, "New York");

        // Displaying the HashTable
        System.out.println("Value of the Table are: ");
        System.out.println(hash_table);
        System.out.println("#####################################");

        // Removing the existing key mapping
        String returned_value = (String) hash_table.remove(20);
        System.out.println("#####################################");

        // Verifying the returned value
        System.out.println("Returned value is: " + returned_value);
        System.out.println("#####################################");

        // Displaying the new table
        System.out.println("Value of the New Table are: ");
        System.out.println(hash_table);
        System.out.println("#####################################");
    }
    public static void hashMaps() {
        // Declare a Hashmap
        hashmap = new HashMap<>();

        // adding Value
        hashmap.put("England", "London");
        hashmap.put("France", "Paris");
        hashmap.put("Algeria", "Algiers");
        hashmap.put("United States", "Washington");

        // get value
        System.out.println("Hashmap Valur are :");
        for (Map.Entry<String, String> hashmap1 : hashmap.entrySet()) {
            System.out.println(hashmap1.getKey() + "    " + hashmap1.getValue());
        }
        System.out.println("===================================");

        // Replace a new value for a particular key using (Key, OldValue, NewValue)

        hashmap.replace("United States", "Washington", "New York");
        // get value
        System.out.println("Hashmap Valur are :");
        for (Map.Entry<String, String> hashmap1 : hashmap.entrySet()) {
            System.out.println(hashmap1.getKey() + "    " + hashmap1.getValue());
        }
        System.out.println("===================================");
    }
}
