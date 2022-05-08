package classobjectmethod;

import java.util.Scanner;

public class Calculator {

    //java class is a blueprint

    //class attributes
    //1-variables
    int number1 =10;
    int number2 = 23;

    //2- methods: a reusable block of code that runs when called
    //methodType methodName(){ code to execute }

    //return method
    int sub(){
        int total = number1 - number2;
        return total;
    }

    double surface(double length, double weidh){
        double total = length * weidh;
        return total;
    }

    int cToF(int c) {
        int f = (c * 9/5) + 32;
        return f;
    }


    public String myName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name?");
        String name = scan.nextLine();
        return name;
    }

    //non-return method
    public void substraction(){
        int total = number2 - number1;
        System.out.println("the total value is :"+total);
    }

    public void addition(){
        int total = number1 + number2;
        System.out.println("the total value is :"+total);
    }

    public void addition2(int num1, int num2){
        int total = num1 + num2;
        System.out.println("the total value is :"+total);
    }
}
