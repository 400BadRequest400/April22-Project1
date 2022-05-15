package collections.mapscollection;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    public static void main(String[] args) {

        //definition
        /*
         * is mapping the key to value
         */

        /* HashMap allows one null key and multiple null values
         * The HashMap class of the Java collections framework provides the functionality of
         * the hash table data structure.
         * It stores elements in key/value pairs.
         * Here, keys are unique identifiers used to associate each value on a map.
         * The HashMap class implements the Map interface.
         */

        // Declare a Hashmap
        Map<String, String> map = new HashMap<>();

        // adding Value
        map.put("England", "London");
        map.put("France", "Paris");
        map.put("Algeria", "Algiers");
        map.put("United States", "Washington");

        //displaying the hashmap
        System.out.println("Hashmap Value are :"+map);
        System.out.println("===================================");

        // get value
        System.out.println("Hashmap Valur are :");
        for (Map.Entry map1 : map.entrySet()) {
            System.out.println(map1.getKey() + "    " + map1.getValue());
        }
        System.out.println("===================================");

        //get a specific value
        System.out.println(map.get("France"));

        // Replace a new value for a particular key using (Key, OldValue, NewValue)
        map.replace("United States", "Washington", "New York");
        // get value
        System.out.println("Hashmap Valur are :");
        for (Map.Entry<String, String> hashmap1 : map.entrySet()) {
            System.out.println(hashmap1.getKey() + "    " + hashmap1.getValue());
        }
        System.out.println("===================================");
    }

}
