package tempconverter;

import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {
        /*Assignment:

				temperature c --> f
				temperature f --> c

				function:
				f = (c*9/5)+32

				c = (f-32)*5/9

				----------------------------Welcome------------------------------
				----Celsius-Fahrenheit/Fahrenheit-Celsius converter----

				choose the conversion mode:
				1- Celsius-Fahrenheit
				2- Fahrenheit-Celsius

				Enter the temperature to convert:

				value C ------------------> value F or value F----------------> value C

				do you want to convert other temperatures ?
				Enter 1 for yes, 2 for no

				if yes (do again - loop)

				if no
				-----------------------Good bye, see you soon---------------------
		*/


            Scanner sc = new Scanner(System.in);
            System.out.println("----------------------welcome to temp converter----------------------------");
            System.out.println();
            System.out.println("Celsius to Fahrenheit & Fahrenheit to Celsius");
            System.out.println("*******************************************************************************");

            String answer;
            int tempToConvert;
            int convertedTemp;

            do {
                System.out.println("choose coversion mode");
                System.out.println("*******************************************************************************");
                System.out.println("1- Celsius to Fahrenheit");
                System.out.println("2- Fahrenheit to Celsius");
                System.out.println("*******************************************************************************");
                answer = sc.next();

                while(!(answer.equals("1")) && !(answer.equals("2")) ) {
                    System.out.println("please choose 1 or 2");
                    answer = sc.next();
                    if(answer == "1" || answer == "2") {
                        break;
                    }

                }

                if(answer.equals("1")) {
                    System.out.println("*******************************************************************************");
                    System.out.println("temp to convert");
                    System.out.println("*******************************************************************************");
                    tempToConvert = sc.nextInt();
                    while(tempToConvert != (int)tempToConvert ) {
                        System.out.println("please enter number");
                        tempToConvert = sc.nextInt();
                        if(tempToConvert == (int)tempToConvert) {
                            break;
                        }
                    }
                    convertedTemp = (tempToConvert*9/5)+32;
                    System.out.println("The Value of the converted temperature is :  "+convertedTemp);
                }else if (answer.equals("2")){
                    System.out.println("temp to convert");
                    tempToConvert = sc.nextInt();
                    convertedTemp = (tempToConvert-32)*5/9;
                    System.out.println("The Value of the converted temperature is :  "+convertedTemp);
                }

                System.out.println("*******************************************************************************");
                System.out.println("do you want to convert another temp?");
                System.out.println("*******************************************************************************");

                System.out.println("1- yes");
                System.out.println("2- no");
                System.out.println("*******************************************************************************");

                answer = sc.nextLine();

                while(!(answer.equals("1")) && !(answer.equals("2")) ) {
                    System.out.println("please choose 1 or 2");
                    System.out.println("*******************************************************************************");
                    answer = sc.next();
                    if(answer == "1" || answer == "2") {
                        break;
                    }

                }

            }while(answer.equals("1"));

            System.out.println("good bye, see you soon");
        }

    }

