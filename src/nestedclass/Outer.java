package nestedclass;

public class Outer {


    //class attribute are properties of a class: variables, constructors and methods

    int outerNum = 52;

    Outer(){

    }

    public void outerMethod(){
        System.out.println("this is outer method");
    }

    Inner inner = new Inner();

    class Inner{


        int inner = 45;

        Inner(){

        }

        public void innerMethod(){
            System.out.println("this is inner method");
        }
    }
}
