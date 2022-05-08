package statickeyword;

public class Human {

    //static: staic properties belongs to a class
    // when using static key word all the properties are created right a way and consuming a memory
    //object: creating an object limit the use of properties


    int height;
    static int weight;

    //non static method can use both static and non static variables
    public void person1(){
        height = 6;
        weight = 123;
        System.out.println("person's height is :"+height+" person's weight is : "+weight);
    }

    //static method can use only static variables
    public static void person2(){
        //height = 34;
        weight = 138;
        System.out.println("Person's weight is : "+weight);
    }
}
