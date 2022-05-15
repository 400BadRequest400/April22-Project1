package collections.setcollection;

import java.util.*;

public class Set_Implementation {

    public static ArrayList<String> arraylist;
    public static LinkedList<Integer> linkedlist;
    public static HashSet<String> set;
    public static TreeSet<String> tree;
    public static LinkedHashSet<Object> link;

    public static void main(String[] args) {
        arrayList();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        linkedList();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        treeSet();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        linkedHashSet();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }

    public static void arrayList() {

        // ArrayList definition

        /*
         * ArrayList in Java is used to store dynamically sized collection of elements.
         * Contrary to Arrays that are fixed in size, an ArrayList grows its size
         * automatically when new elements are added to it. ArrayList is part of Java's
         * collection framework and implements Java's List interface.
         */

        // Declare ArrayList
        arraylist = new ArrayList<>();

        // Add Value to ArrayList
        arraylist.add("Messi");
        arraylist.add("Messi");
        arraylist.add("Zidane");
        arraylist.add("Ronaldo");
        arraylist.add("Pele");
        arraylist.add("Maradona");

        // Get size of the ArrayList
        System.out.println("ArrayList size is :" + arraylist.size());
        System.out.println("===================================");

        // Get value using regular method
        System.out.println("ArrayList value are :" + arraylist);
        System.out.println("===================================");

        // Get value using Iterator
        Iterator<String> itr = arraylist.iterator();
        System.out.println("Array List value using Iterator are :");
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        System.out.println("\n===================================");

        // Using for each loop
        for (String array : arraylist) {
            System.out.println("arrayList value using for each loop are :" + array);
        }
        System.out.println("===================================");

        // remove a value by index
        arraylist.remove(2);

        // After removing a value
        System.out.println("ArrayList size is :" + arraylist.size());
        System.out.println("ArrayList value after removing a value are :" + arraylist);
        System.out.println("===================================");

        // Contains method
        System.out.println(arraylist.contains("Messi"));
        System.out.println("===================================");

        // Get value by index
        System.out.println(arraylist.get(1));
        System.out.println("===================================");

        // Checking if arrayList is empty
        System.out.println(arraylist.isEmpty());

    }

    public static void linkedList() {
        // LinkedList Definition

        /*
         * LinkedList should be used where modifications to a collection are frequent
         * like addition/deletion operations. LinkedList is much faster as compare to
         * ArrayList in such cases. In case of read-only collections or collections
         * which are rarely modified, ArrayList is suitable.
         */

        // Declare a LinkedList
        linkedlist = new LinkedList<>();

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

        // Get value using Iterator
        System.out.println("LinkedList value using Iterator are :");
        Iterator<Integer> itr = linkedlist.iterator();
        while (itr.hasNext()) {
            System.out.println(+itr.next());
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

    public static void hashSet() {

        // HashSet definition

        /*
         * HashSet stores the elements by using a mechanism called hashing. HashSet
         * contains unique elements only. HashSet allows null value. HashSet class is
         * non synchronized. HashSet doesn't maintain the insertion order.
         */

        // Declare a HashSet
        set = new HashSet<>();

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

    public static void treeSet() {

        // TreeSet definition
        /*
         * TreeSet is one of the most important implementations of the SortedSet
         * interface in Java that uses a Tree for storage. The ordering of the elements
         * is maintained by a set using their natural ordering whether or not an
         * explicit comparator is provided.
         */

        // Declare TreeSet
        tree = new TreeSet<>();

        // Add value to TreeSet
        tree.add("Messi");
        tree.add("Ronaldo");
        tree.add("Pele");
        tree.add("Zidane");
        tree.add("Maradona");
        tree.add("A");
        tree.add("C");
        tree.add("B");

        // Check size
        System.out.println("Size of the TreeSet is : " + tree.size());
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        // Iterate
        Iterator<String> itr = tree.iterator();
        System.out.println("Value of TreeSet using Iterator are :");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        // for each loop
        System.out.println("Value of TreeSet using ForEach loop are : ");
        for (String newtree : tree) {
            System.out.println(newtree + " ,");
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        // Getting the first value
        System.out.println("the first value is :");
        System.out.println(tree.first());
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        // Getting the last value
        System.out.println("the last value is :");
        System.out.println(tree.last());
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

    }

    public static void linkedHashSet() {
        link = new LinkedHashSet<Object>();

        // Add Value to LinkedHashSet
        link.add("Messi");
        link.add("Zidane");
        link.add("Ronaldo");

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
