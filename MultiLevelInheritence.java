import java.util.Scanner;

// Base class (Grandparent)
class Device {
    Scanner s = new Scanner(System.in);
    String brand;
    int price;

    void grandparentClass() {
        System.out.println("Enter the Brand Name:");
        brand = s.next();
        System.out.println("Enter the Price:");
        price = s.nextInt();
    }
}

// Derived class (Parent)
class Computer extends Device {
    String processor;

    void parentClass() {
        System.out.println("Enter the Processor You Want:");
        processor = s.next();
    }
}

// Derived class (Child)
class Laptop extends Computer {
    String ramSize;

    void childClass() {
        System.out.println("Enter the RAM Size You Want:");
        ramSize = s.next();
    }
}

// Main class
public class MultiLevelInheritence {

    public static void main(String[] args) {
        Laptop l = new Laptop();

        // Call all methods from the inheritance chain
        l.grandparentClass();
        l.parentClass();
        l.childClass();

        // Display the details
        System.out.println("\n*** Device Details ***");
        System.out.println("Brand Name: " + l.brand);
        System.out.println("Price: " + l.price);
        System.out.println("Processor: " + l.processor);
        System.out.println("RAM Size: " + l.ramSize);
    }
}
