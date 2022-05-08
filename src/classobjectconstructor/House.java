package classobjectconstructor;

public class House {

    //variables
    int address;
    String houseName;
    private char unit;


    //constructors
    //built constructor
    public House(String houseName){
        this.houseName = houseName;
    }

    House (String houseName, int address){
        this.houseName = houseName;
        this.address = address;
    }

    //default constructor
    public House(){

    }

    public void method1(int address){
        this.address = 52;
        address = 20;
    }

    public void method2(){
        this.address = 100;
        address = 500;
    }

    //methods
    public void kitchen(){
        System.out.println("miam miam eat the whole day");
    }

    public void room(){
        System.out.println("sleep zzzzzzzzzzzzzzzzzzzzzz");
    }

    public void bathRoom(){
        System.out.println("shower shower lalalalalalalala");
    }
}
