package classobjectmethod;

public class UseCalculator {

    public static void main(String[] args) {

        //object: is an instance of a class
        //syntax: ClassName objectname = new ClassName();
        Calculator cal = new Calculator();

        int myTotal = cal.sub();
        System.out.println(myTotal);

        double mySurface = cal.surface(23.7, 64.4);
        System.out.println(mySurface);

        double myTemp = cal.cToF(0);
        System.out.println(myTemp);

        cal.substraction();

        cal.addition2(2, 67);
        cal.addition2(23, 45);
        cal.addition2(134, 142);

    }
}
