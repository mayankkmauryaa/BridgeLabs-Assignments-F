
class Car {

    String model;
    int year;
}

public class q1 {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = "Tesla Model S";
        c1.year = 2022;

        Car c2 = new Car();
        c2.model = "BMW i8";
        c2.year = 2021;

        System.out.println(c1.model + " - " + c1.year);
        System.out.println(c2.model + " - " + c2.year);
    }
}
