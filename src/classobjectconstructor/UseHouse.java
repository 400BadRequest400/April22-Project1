package classobjectconstructor;

public class UseHouse {

    public static void main(String[] args) {

        House myHouse = new House("white house", 1235);

        myHouse.room();

        House yourHouse = new House("The mellenium");
        yourHouse.bathRoom();

        House theHouse = new House();
        theHouse.bathRoom();


    }
}
