// Base class
class Person {
    void basicInfo() {
        System.out.println("Every person has a name and age.");
    }
}

// Single Inheritance
class Employee extends Person {
    void employeeDetails() {
        System.out.println("Employee has an ID and department.");
    }
}

// Hierarchical Inheritance (Another subclass of Person)
class Manager extends Person {
    void manageTeam() {
        System.out.println("Manager handles team operations.");
    }
}

class Intern extends Person {
    void internDetails() {
        System.out.println("Intern is in training period.");
    }
}

// Multilevel Inheritance
class TeamLead extends Employee implements FullTime {
    void leadProject() {
        System.out.println("Team Lead manages the project and guides the team.");
    }

    public void workingType() {
        System.out.println("Team Lead is a full-time employee.");
    }
}

// Interface (for multiple inheritance in Java)
interface FullTime {
    void workingType();
}

// Main class
public class HybridInheritance {

    public static void main(String[] args) {

        System.out.println("Multilevel Inheritance Example:");
        TeamLead lead = new TeamLead();
        lead.basicInfo();         // From Person
        lead.employeeDetails();   // From Employee
        lead.leadProject();       // From TeamLead
        lead.workingType();       // From FullTime interface

        System.out.println("\nHierarchical Inheritance Example:");
        Manager manager = new Manager();
        manager.basicInfo();      // From Person
        manager.manageTeam();     // From Manager

        Intern intern = new Intern();
        intern.basicInfo();       // From Person
        intern.internDetails();   // From Intern
    }
}
