package datastructure;

import java.util.Stack;

public class UseStack {

    public static void main(String[] args) {


        Stack <Integer> stack = new Stack<>();

        stack.push(53);
        stack.push(45);
        stack.push(21);
        stack.push(23);

        //get the value
        System.out.println(stack);

        //removing value
        //last in first out
        stack.pop();

        //get the value
        System.out.println(stack);

        //peack (getting the last value)
        System.out.println(stack.peek());

        //checking if the stack is empty
        System.out.println(stack.empty());

        //searching for an object position (no index)
        System.out.println(stack.search(53));
        System.out.println(stack.search(45));
    }
}
