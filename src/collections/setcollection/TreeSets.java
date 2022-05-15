package collections.setcollection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSets {

    public static void main(String[] args) {

        //TreeSet definition
        /*
         * TreeSet is one of the most important implementations of the
         * SortedSet interface in Java that uses a Tree for storage.
         * The ordering of the elements is maintained by a set using their
         * natural ordering whether or not an explicit comparator is provided.
         */

        // Declare TreeSet
        TreeSet<String> tree = new TreeSet<>();

        // Add value to TreeSet
        tree.add("Messi");
        tree.add("Messi");
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
}
