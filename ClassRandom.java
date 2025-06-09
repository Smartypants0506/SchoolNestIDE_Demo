import java.util.Random;

public class ClassRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] brands = {"Toyota", "Honda", "Ford"};
        String brand = brands[rand.nextInt(brands.length)];
        int year = 2000 + rand.nextInt(25);

        Car car = new Car(brand, year);
        car.displayInfo();
    }
}

class Car {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
