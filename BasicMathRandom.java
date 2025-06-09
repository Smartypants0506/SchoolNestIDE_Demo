import java.util.Random;

public class BasicMathRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(100);
        int b = rand.nextInt(100);

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Sum: " + (a + b));
        System.out.println("Product: " + (a * b));
    }
}
