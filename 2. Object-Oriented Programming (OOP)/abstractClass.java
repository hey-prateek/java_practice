abstract class Vehicle {
    abstract void drive();
}

class Car extends Vehicle {
    void drive() {
        System.out.println("inside Car...");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}
