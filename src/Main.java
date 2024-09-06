import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int value1 = rand.nextInt(0, 99);
        int value2 = rand.nextInt(0, 99);
        System.out.println("Value 1 is: " + value1);
        System.out.println("Value 2 is: " + value2);
        System.out.println("The sum of Value 1 and 2 is: " + (value1 + value2));
    }
}