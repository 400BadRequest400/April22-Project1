package datastructure;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {


        Queue <Integer> queue = new PriorityQueue<>();

        queue.add(52);
        queue.add(23);
        queue.add(65);
        queue.add(89);
        queue.add(1);

        //get the value with the order
        System.out.println(queue);

        //remove a value
        queue.poll();

        System.out.println(queue);

        System.out.println("++++++++++++++++++++++++++++++");

        Queue<String> qList = new LinkedList<String>();
        qList.add("Five");
        qList.add("Two");
        qList.add("One");
        qList.add("Three");
        qList.add("Four");
        System.out.println("Elements in the list are : "+qList);
        System.out.println("Actual size of this list are : "+qList.size());

//        qList.remove("Three");
//        System.out.println("After Removing");
//        System.out.println("Elements in the list are : "+qList);
//        System.out.println("Current size of this list are : "+qList.size());
//
//        System.out.println("List Contains element 'Three' or not? : "+qList.contains("Three"));
//
//        if(qList.contains("Three")) {
//            System.out.println("Contains");
//        }else {
//            System.out.println("Not Contains");
//        }

    }
}
