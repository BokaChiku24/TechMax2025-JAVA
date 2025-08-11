package oops.abstraction.abstractmethodclass;

abstract class Person {
    public abstract void displayDetails();
}

class Employee extends Person {
    int employeeId;
    String name;
    String address;

    public Employee(int employeeId, String name, String address) {
        this.employeeId = employeeId;
        this.name = name;
        this.address = address;
    }

    @Override
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

class Worker extends Person {
    int hours;
    String name;
    public Worker(int hours, String name) {
        this.hours = hours;
        this.name = name;
    }
    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Hours worked: " + hours);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Person employee = new Employee(101, "John Doe", "123 Main St");
        employee.displayDetails();

        Person worker = new Worker(40, "Jane Smith");
        worker.displayDetails();
    }
}
