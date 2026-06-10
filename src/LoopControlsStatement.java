public class LoopControlsStatement {

    public static void main(String[] args) {

        // Break statement example

        int[] numbers = {10,20, 30, 40, 50};
        int target = 30;
        for (int i=0; i < numbers.length; i++) {

            if (numbers[i] == target) {
                System.out.println("Target found: " + numbers[i]);
                break; // Exit the loop when target is found
            }
        }

        // Continue statement example

        for (int i=1; i <=10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println("Odd number: " + i);
        }

    }
}
