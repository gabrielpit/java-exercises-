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

public class ClassesObjects {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2020);
        car1.displayInfo();

        Car car2 = new Car("Honda", 2018);
        car2.displayInfo();
    }
}
