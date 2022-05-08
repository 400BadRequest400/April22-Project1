package datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

    public static void main(String[] args) {

        // LinkedList Definition

        /*
         * LinkedList should be used where modifications to a collection are frequent
         * like addition/deletion operations. LinkedList is much faster as compare to
         * ArrayList in such cases. In case of read-only collections or collections
         * which are rarely modified, ArrayList is suitable.
         */

        // Declare a LinkedList
        LinkedList<Integer> linkedlist = new LinkedList<>();

        // Add value to LinkedList
        linkedlist.add(23);
        linkedlist.add(56);
        linkedlist.add(12);
        linkedlist.add(10);
        linkedlist.add(76);



        // Get size of LinkedList
        System.out.println("LinkedList size is :" + linkedlist.size());
        System.out.println("********************************************");

        // Get value using regular method
        System.out.println("Linked list value are :" + linkedlist);
        System.out.println("********************************************");

        //first in first out
        System.out.println(linkedlist.remove());
        System.out.println(linkedlist.remove());
        System.out.println("Linked list value are :" + linkedlist);
        System.out.println("********************************************");

        // Get value using Iterator
        System.out.println("LinkedList value using Iterator are :");
        Iterator<Integer> itr = linkedlist.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("********************************************");

        // Get value using for each loop
        System.out.println("LinkedList value using for each loop are :");
        for (Integer link : linkedlist) {
            System.out.println(link);
        }

        System.out.println("********************************************");
        // remove a value by index
        linkedlist.remove(2);

        // After removing a value
        System.out.println("LinkedList size is :" + linkedlist.size());
        System.out.println("LinkedList value after removing a value are :");
        System.out.println(linkedlist);
        System.out.println("********************************************");

        // Contains method
        System.out.println(linkedlist.contains(56));
        System.out.println("********************************************");

        // Get value by index
        System.out.println(linkedlist.get(1));
        System.out.println("********************************************");

        // Checking if arrayList is empty
        System.out.println(linkedlist.isEmpty());

    }
}
