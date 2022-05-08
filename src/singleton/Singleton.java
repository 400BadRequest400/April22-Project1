package singleton;

public class Singleton {

    //protect the creation of the object outside of this class
    private Singleton(){

    }

    //create a private object of the class
    private static Singleton singleton = new Singleton();


    //Encapsulation: getter the object
    public static Singleton getInstance(){
        return singleton;
    }


    public void doWork(){
        System.out.println("do the work");
    }
}
