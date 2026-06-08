
public class VariablesDataTypes {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        //Primitive Data Types in Java
        int myInt = 10;
        double myDouble = 3.14;
        char myChar = 'A';
        boolean myBoolean = true;

        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);

        //Non-Primitive Data Types in Java
        String myString = "Hello world!";
        System.out.println("String: " + myString);

        //Implicit Casting (automatic no chances of lose data)
        int num = 100;
        double doubleNum = num;
        System.out.println("Implicit Type Casting: " + doubleNum);

        //Explicit Casting (manual casting a lot of chances to lose data)
        double myDoubleValue = 9.99;
        int myIntValue = (int) myDoubleValue;
        System.out.println("Explicit Type Casting: " + myIntValue);
        // we are losing 0.99

    }
}