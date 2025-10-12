class Car {
    String name;
    int model;

    Car(String name, int model) {
        this.name = name;
        this.model = model;
    }

    Car(Car c) {
        this.name = c.name;
        this.model = c.model;
    }
}

public class copyConstructor {
    public static void main(String[] args) {
        Car c1 = new Car("ford", 2022);
        System.out.println("c1: " + c1.name + " " + c1.model);

        Car c2 = new Car(c1);
        System.out.println("c2: " + c2.name + " " + c2.model);
    }
}