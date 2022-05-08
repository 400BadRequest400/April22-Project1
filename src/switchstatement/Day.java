package switchstatement;

public class Day {

    public void task(Week day) {

        switch (day) {
            case Monday:
                System.out.println("mentoring day");
                break;
            case Tuesday:
                System.out.println("review video");
                break;
            case Wednesday:
                System.out.println("code lab day");
                break;
            case Thursday:
                System.out.println("homework day");
                break;
            case Friday:
                System.out.println("rest day");
                break;
            case Saturday:
                System.out.println("first class");
                break;
            case Sunday:
                System.out.println("second class");
                break;
        }

    }
}
