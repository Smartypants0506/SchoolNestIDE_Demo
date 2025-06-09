import java.util.Random;

public class TryCatchRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        int denom = rand.nextInt(3);

        System.out.println("Trying to divide 10 by " + denom);
        try {
            int result = 10 / denom;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
