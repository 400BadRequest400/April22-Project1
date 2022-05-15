package homework;

import java.util.Random;
import java.util.Scanner;

public class ShuffleGame {

    public static void main (String [] args) {

        int number;
        int play;

        Scanner scan = new Scanner(System.in);


        System.out.println("********** Welcome **********");
        System.out.println();

        do {

            System.out.println("Please enter a number between 1 and 3 ");
            number=scan.nextInt();

            Random random = new Random();
            int guess = random.nextInt(3) + 1;

            if (number==guess)
            {
                System.out.println("Congratulation!!! You won!");
                System.out.println("Do you want to play again ?");
                System.out.println("Press 1 for YES or 2 for NO");
                play =scan.nextInt();
            }

            else
            {
                System.out.println("You lost ! :( ");
                System.out.println("The lucky number was " +guess);
                System.out.println("Do you want to play again ?");
                System.out.println("Press 1 for YES or 2 for NO");
                play=scan.nextInt();
            }
        }

        while(play==1);

        System.out.println("Ok good bye ,see you soon!");

    }
}
