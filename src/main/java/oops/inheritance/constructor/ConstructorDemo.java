package oops.inheritance.constructor;

class A{
    public A() {
        System.out.println("Default constructor of class A called");
    }
}

class B extends A{
    public B() {
        System.out.println("Default constructor of class B called");
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        A obj1 = new A();  // Calls default constructor of class A
        B obj2 = new B();  // Calls default constructor of class B
    }
}
