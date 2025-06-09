import java.util.Random;

public class IfElseRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        System.out.println("Number: " + number);
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}