package superKw;

public class Child extends Father {


    //this: is a key word to refer to the global variable
    //super: is a key word to access to parent class


    Child(){
        super(67);
    }

    public void school(){
        super.education();
        super.weight = 190;
    }
}
