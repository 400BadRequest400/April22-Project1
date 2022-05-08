package exception.runtimeexception;

public class Calculator {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line 3");
        try{
            System.out.println("line 5"+a/b);
        }catch(Exception e){
            System.out.println("error in line 4");
            e.printStackTrace();
        }
        System.out.println("line 5");
        System.out.println("line 6");
    }
}
