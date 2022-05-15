package collections.mapscollection;

import java.util.LinkedHashMap;

public class LinkedHshMaps {

    public static void main(String[] args) {

        /*
         * A LinkedHashMap contains values based on the key.
         * It implements the Map interface and extends the HashMap class.
         * It contains only unique elements.
         * It may have one null key and multiple null values.
         * It is non-synchronized.
         * It is the same as HashMap with an additional feature that it maintains insertion order. For example, when we run the code with a HashMap, we get a different order of elements.
         */


        // Creating an empty LinkedHashMap
        LinkedHashMap<String, String> link = new LinkedHashMap<String, String>();

        // Adding entries in Map using put() method
        link.put("one", "Barcelona");
        link.put("two", "Real Madrid");
        link.put("three", "Manchester");

        // Printing all entries inside Map
        System.out.println(link);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        // Note: It prints the elements in same order as they were inserted

        // Getting and printing value for a specific key
        System.out.println("Getting value for key 'one': "+ link.get("one"));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        // Getting size of Map using size() method
        System.out.println("Size of the map: "+ link.size());
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        // Checking whether Map is empty or not
        System.out.println("Is map empty? "+ link.isEmpty());
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        // Using containsKey() method to check for a key
        System.out.println("Contains key 'two'? "+ link.containsKey("two"));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        // Removing entry using remove() method
        System.out.println("delete element 'one': "+ link.remove("one"));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        // Printing mappings to the console
        System.out.println("Mappings of LinkedHashMap : "+ link);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

}
