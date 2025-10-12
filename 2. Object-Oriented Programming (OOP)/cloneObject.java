class Car implements Cloneable {
    private String name;

    Car(String name) {
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return this.name;
    }
}

public class cloneObject {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car c1 = new Car("ford");
        System.out.println(c1.getName());

        Car c2 = (Car) c1.clone();
        System.out.println(c2.getName());
    }
}
