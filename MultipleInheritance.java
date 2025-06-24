// Interface
interface D {
    void dType();
}

// Base Class
class A {
    void aType() {
        System.out.println("Class A");
    }
}

// Derived Class from A
class B extends A {
    void bType() {
        System.out.println("Class B inherits from A");
    }
}

// Derived Class from B and implements D
class C extends B implements D {
    void cType() {
        System.out.println("Class C inherits from B");
    }

    public void dType() {
        System.out.println("Class C inherits from D");
    }
}

// Main Class
public class MultipleInheritance {
    public static void main(String[] args) {
        C obj = new C();

        obj.aType(); // Accessing method from class A
        obj.bType(); // Accessing method from class B
        obj.cType(); // Accessing method from class C
        obj.dType(); // Accessing method from interface D
    }
}
