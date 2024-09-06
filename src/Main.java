import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Create an instance of random to get random numbers
        Random rand = new Random();

        // Get a random number between 0 and 99 for both values
        int value1 = rand.nextInt(0, 99);
        int value2 = rand.nextInt(0, 99);

        // Print the values so the user knows the numbers before the calculation
        System.out.println("Value 1 is: " + value1);
        System.out.println("Value 2 is: " + value2);

        // Print the sum of the numbers
        System.out.println("The sum of Value 1 and 2 is: " + (value1 + value2));

        // Print the subtraction of the numbers
        System.out.println("The subtraction of Value 1 and 2 is: " + (value1 - value2));

        // Print the multiplication of the numbers
        System.out.println("The multiplication of Value 1 and 2 is: " + (value1 * value2));

        // Print the division of the numbers if the value 2 is not zero, or print a message if it is
        if (value2 == 0) {
            System.out.println("The division of Value 1 and 2 is: Cannot divide by zero");
        } else {
            System.out.println("The division of Value 1 and 2 is: " + (value1 / value2));
        }
    }
}