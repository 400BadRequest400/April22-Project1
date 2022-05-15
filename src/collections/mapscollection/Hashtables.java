package collections.mapscollection;

import java.util.Hashtable;
import java.util.Map;

public class Hashtables {

    public static void main(String[] args) {

        /*
         * Hashtable doesn't allow any null key or value
         */

        // Creating an empty HashTable
        Map<Integer, String> hash_table = new Hashtable<Integer, String>();

        // Inserting elements into the table
        hash_table.put(10, "London");
        hash_table.put(15, "Algiers");
        hash_table.put(20, "Paris");
        hash_table.put(25, "washington");
        hash_table.put(30, "New York");

        //getting the value
        for (Map.Entry table: hash_table.entrySet()) {
            System.out.println(table.getKey()+"  "+table.getValue());
        }
        System.out.println("#####################################");

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
}
