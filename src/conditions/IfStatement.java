package conditions;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {


        //capture user input
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the number");
        int x = scan.nextInt();

        if (x > 0){
            System.out.println("this number is positive");
        }else if (x < 0){
            System.out.println("this number is negative");
        }else{
            System.out.println("this number is equal to 0");
        }

        //if(condition){body}

        //if(condition){body}else if(condition){body}...

        //if(condition){body}else{body}

        //if(condition){body}else if(condition){body}...else{body}
    }
}