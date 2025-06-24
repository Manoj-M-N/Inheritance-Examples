import java.util.Scanner;

// Parent Class
class Vehicle {
    void display() {
        System.out.println("\nA Vehicle has an Engine.");
        System.out.println("It uses Petrol, Diesel, or Electricity for Running.");
    }
}

// Child Class 1
class Car extends Vehicle {
    Scanner s = new Scanner(System.in);
    String engine;

    void carType() {
        System.out.println("\nEnter type of Engine:");
        engine = s.next();
        System.out.println("\n** Car Details **");
        super.display();
        System.out.println("Engine: " + engine);
    }
}

// Child Class 2
class Bike extends Vehicle {
    Scanner s = new Scanner(System.in);
    String brand;

    void bikeType() {
        System.out.println("\nEnter the Brand:");
        brand = s.next();
        System.out.println("\n** Bike Details **");
        super.display();
        System.out.println("Brand Name: " + brand);
    }
}

// Child Class 3
class Tractor extends Vehicle {
    void tractorType() {
        System.out.println("\n** Tractor Details **");
        super.display();
        System.out.println("Tractor uses Diesel.");
    }
}

// Main Class
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        Tractor t = new Tractor();

        c.carType();
        b.bikeType();
        t.tractorType();
    }
}
