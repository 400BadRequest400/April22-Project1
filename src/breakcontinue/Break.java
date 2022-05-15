package breakcontinue;

public class Break {

    public static void main(String[] args) {

//        int a = 10;
//
//        System.out.println(++a);
//        System.out.println(a);
//
//        System.out.println(a++);
//
//        System.out.println(a);

        for (int i=0; i<50; i++){

            if (i > 35){
                break;
            }
            System.out.println(i);

        }
    }
}
