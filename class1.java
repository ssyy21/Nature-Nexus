class Employee {
    private String name;
    private String address;
    private int age;
    private String gender;

    public Employee(String name, String address, int age, String gender) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class FullTimeEmployee extends Employee {
    private double salary;
    private String designation;

    public FullTimeEmployee(String name, String address, int age, String gender, double salary, String designation) {
        super(name, address, age, gender);
        this.salary = salary;
        this.designation = designation;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }
}

class PartTimeEmployee extends Employee {
    private int workHours;
    private double ratePerHour;

    public PartTimeEmployee(String name, String address, int age, String gender, int workHours, double ratePerHour) {
        super(name, address, age, gender);
        this.workHours = workHours;
        this.ratePerHour = ratePerHour;
    }

    public double calculatePay() {
        return workHours * ratePerHour;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Pay: " + calculatePay());
    }
}

public class class1 {
    public static void main(String[] args) {
        System.out.println("Full-time employee details:");
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Doe", "123 Main St", 30, "Male", 50000, "Software Engineer");
        fullTimeEmployee.displayDetails();

        System.out.println("\nPart-time employee details:");
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jane Smith", "456 Elm St", 25, "Female", 20, 15);
        partTimeEmployee.displayDetails();
    }
}
