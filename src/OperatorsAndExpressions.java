public class OperatorsAndExpressions {
    public static void main(String[] args) {

        // Arithmetic Operators in Java

        double price1 = 1000;
        double price2 = 500;

        double totalPrice = price1 + price2; // Addition
        double discount = 0.1 * totalPrice; // Multiplication
        double finalPrice = totalPrice - discount; // Subtraction

        System.out.println("The total price is: " + totalPrice);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);

        // Relational Operators in Java

        int age = 25;
        boolean isAdult = age >= 18;
        System.out.println("Is Adult: " + isAdult);
        System.out.println("Eligible for voting: " + (age >= 18));

        // Logical Operators
        int edad = 20;
        int stock = 10;
        boolean hasDriverLicense = true;
        boolean isAdmin = false;
        boolean accountLocked = false;
        String username = "Leonel";

        // AND (&&)
        System.out.println(edad >= 18 && hasDriverLicense);

        // OR (||)
        System.out.println(isAdmin || hasDriverLicense);

        // NOT (!)
        System.out.println(!accountLocked);

        // Equal to (==)
        System.out.println(stock == 10);

        // Not equal to (!=)
        System.out.println(stock != 0);

        // Greater than (>)
        System.out.println(stock > 5);

        // Less than (<)
        System.out.println(stock < 20);

        // Greater than or equal to (>=)
        System.out.println(edad >= 18);

        // Less than or equal to (<=)
        System.out.println(stock <= 10);

        // String comparison
        System.out.println(username.equals("Leonel"));

    }
}
