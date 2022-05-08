package datastructure;

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

    }
}
