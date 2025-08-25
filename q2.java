
class Car {

    String model;
    int year;
    static int numberOfCars = 0;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
        numberOfCars++;
    }
}

public class q2 {

    public static void main(String[] args) {
        Car c1 = new Car("Tesla", 2022);
        Car c2 = new Car("BMW", 2021);

        System.out.println("Cars created: " + Car.numberOfCars);
    }
}
