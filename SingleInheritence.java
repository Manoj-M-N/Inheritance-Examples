import java.util.Scanner;

// Base class
class Crop {
    String name;
    int time;
    Scanner s = new Scanner(System.in);

    public void basicDetails() {
        System.out.println("Enter the name of the crop:");
        name = s.next();
        System.out.println("Enter the time required to cultivate the crop:");
        time = s.nextInt();
    }
}

// Derived class
class Rice extends Crop {
    String climate;

    public void display() {
        super.basicDetails();
        System.out.println("Enter the climate required:");
        climate = s.next();
    }
}

// Main class
public class SingleInheritence {
    public static void main(String[] args) {
        Rice r = new Rice();
        r.display();

        System.out.println("\n--- Crop Details ---");
        System.out.println("Crop Name: " + r.name);
        System.out.println("Cultivation Time: " + r.time + " days");
        System.out.println("Required Climate: " + r.climate);
    }
}
