package switchstatement;

import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {
        //String day = "Monday";

        //capture user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the day of the week");
        String day = scan.nextLine();

        switch(day) {
            case "Monday":
                System.out.println("mentoring day");
                break;
            case "Tuesday":
                System.out.println("review video");
                break;
            case "Wednesday":
                System.out.println("code lab day");
                break;
            case "Thursday":
                System.out.println("homework day");
                break;
            case "Friday":
                System.out.println("rest day");
                break;
            case "Saturday":
                System.out.println("first class");
                break;
            case "Sunday":
                System.out.println("second class");
                break;
            default:
                System.out.println("invalid day");
        }

    }
}
