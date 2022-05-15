package collections.setcollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {

    public static void main(String[] args) {

        // ArrayList definition

        /*
         * ArrayList in Java is used to store dynamically sized collection of elements.
         * Contrary to Arrays that are fixed in size,
         * an ArrayList grows its size automatically
         * when new elements are added to it.
         * ArrayList is part of Java's collection framework
         * and implements Java's List interface.
         */

        //Declare ArrayList
        ArrayList<String> arraylist = new ArrayList<>();

        //Add Value to ArrayList
        arraylist.add("Messi");
        arraylist.add("Messi");
        arraylist.add("Zidane");
        arraylist.add("Ronaldo");
        arraylist.add("Pele");
        arraylist.add("Maradona");

        //get the specific value of a specific index
        System.out.println(arraylist.get(2));
        System.out.println("===================================");

        //Get size of the ArrayList
        System.out.println("ArrayList size is :"+arraylist.size());
        System.out.println("===================================");

        //Get value using regular method
        System.out.println("ArrayList value are :"+arraylist);
        System.out.println("===================================");

        //Get value using Iterator
        Iterator<String> itr = arraylist.iterator();
        System.out.println("Array List value using Iterator are :");
        while(itr.hasNext()) {
            System.out.print(itr.next()+", ");
        }
        System.out.println("\n===================================");

        //Using for each loop
        for (String array : arraylist) {
            System.out.println("arrayList value using for each loop are :"+array);
        }
        System.out.println("===================================");

        //remove a value by index
        arraylist.remove(2);

        //After removing a value
        System.out.println("ArrayList size is :"+arraylist.size());
        System.out.println("ArrayList value after removing a value are :"+arraylist);
        System.out.println("===================================");

        //Contains method
        System.out.println(arraylist.contains("Messi"));
        System.out.println("===================================");

        //Get value by index
        System.out.println(arraylist.get(1));
        System.out.println("===================================");

        //Checking if arrayList is empty
        System.out.println(arraylist.isEmpty());


    }
}
