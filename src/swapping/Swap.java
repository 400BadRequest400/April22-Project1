package swapping;

public class Swap {

    public static void main(String[] args) {

        int a = 23;
        int b = 64;

        System.out.println("a :"+a);
        System.out.println("b :"+b);
        System.out.println("*****************************");


        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a :"+a);
        System.out.println("b :"+b);

    }
}
