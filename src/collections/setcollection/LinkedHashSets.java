package collections.setcollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {

    public static void main(String[] args) {

        /*
        linkedhashset keep the order of the insertion of the list contrary to hashet
         */

        LinkedHashSet<Object> link = new LinkedHashSet<Object>();

        // Add Value to LinkedHashSet
        link.add("Messi");
        link.add("Zidane");
        link.add("Ronaldo");
        link.add("Baggio");
        link.add("Romario");

        // Get value using Iterator
        System.out.println("LinkedList value using Iterator are :");
        Iterator<Object> itr = link.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        // removeAll value
        link.removeAll(link);
        System.out.println("value of the linkHashSet after removing the value are :");
        System.out.println(link);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        // add Integer and String value in the same LinkedHashSet
        link.add(23);
        link.add("Maradona");
        link.add(177849987598724569l);
        link.add('Q');

        // Get value using for each loop
        System.out.println("LinkedList value using for each loop are :");
        for (Object list : link) {
            System.out.println(list);
        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

    }

}
