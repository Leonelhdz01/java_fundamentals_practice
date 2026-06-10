public class ControlStatements {
    public static void main(String[] args) {

        int marks =50;

        if (marks >= 50) {
            System.out.println("You have passed the exam," + " Your marks is: " + marks);
        } else {
                System.out.println("You have failed the exam," + " Your marks is: " + marks);
        }


        // Switch case example

        int dayOfWeek = 1;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day of the week.");
        }
    }
}
