package collections.setcollection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {

    public static void main(String[] args) {

        // HashSet definition

        /*
         * HashSet stores the elements by using a mechanism called hashing. HashSet
         * contains unique elements only. HashSet allows null value. HashSet class is
         * non synchronized. HashSet doesn't maintain the insertion order.
         */

        // Declare a HashSet
        HashSet<String> set = new HashSet<>();

        // Add value to HashSet
        set.add("Messi");
        set.add("Ronaldo");
        set.add("Pele");
        set.add("Zidane");
        set.add("Maradona");
        set.add("Messi");
        set.add("Ronaldo");

        // Size of hashSet
        System.out.println("HashSet doesn't take duplicate value");
        System.out.println("Size of the HashSet is : " + set.size());
        System.out.println("###############################################");

        // Get value using Iterator
        System.out.println("Value of The HashSet using Iterator are :");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("###############################################");

        // Get value using ForEach loop
        System.out.println("Value of The HashSet using for each loop are :");
        for (String hset : set) {
            System.out.println(hset);
        }
        System.out.println("###############################################");

        // remove a value by index
        set.remove("Pele");

        // After removing a value
        System.out.println("Hashset size is :" + set.size());
        System.out.println("HashSet value after removing a value are :");
        System.out.println(set);
        System.out.println("###############################################");

        // Contains method
        System.out.println(set.contains("Maradona"));
        System.out.println("###############################################");

        // Checking if arrayList is empty
        System.out.println(set.isEmpty());

    }

}
