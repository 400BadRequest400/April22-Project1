package singletonpractice;

public class Singleton2 {

    private static Singleton2 singleton2 = new Singleton2();


    public static Singleton2 myInstance(){
        return singleton2;
    }


    private Singleton2(){

    }

    public void school(){
        System.out.println("today is a holiday");
    }
}
