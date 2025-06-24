// Interface 1
interface Father {
    void fatherType();
}

// Interface 2
interface Mother {
    void motherType();
}

// Class implementing multiple interfaces
class Child implements Father, Mother {
    public void fatherType() {
        System.out.println("Child's face is similar to his Father.");
    }

    public void motherType() {
        System.out.println("Child's behaviour is similar to his Mother.");
    }

    void childType() {
        System.out.println("Child has properties of both Father and Mother.");
    }
}

// Main Class
public class MultipleInheritance {
    public static void main(String[] args) {
        Child c = new Child();

        c.fatherType();   // Method from Father interface
        c.motherType();   // Method from Mother interface
        c.childType();    // Method from Child class
    }
}
