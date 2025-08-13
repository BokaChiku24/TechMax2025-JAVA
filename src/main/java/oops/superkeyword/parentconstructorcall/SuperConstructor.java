package oops.superkeyword.parentconstructorcall;

class A{
    public A() {
        System.out.println("Default constructor of class A called");
    }
    public A(int x) {
        System.out.println("Parameterized constructor of class A called with parameter x = " + x);
    }
}

class B extends A{
    public B() {
        super();  // Calls default constructor of class A
        System.out.println("Default constructor of class B called");
    }
    public B(int x) {
        super(x);  // Calls parameterized constructor of class A with parameter x
        System.out.println("Parameterized constructor of class B called with parameter x = " + x);
    }
}

public class SuperConstructor {
    public static void main(String[] args) {
        System.out.println("Creating object of class B with parameter x = 10: ");
        B b = new B(10);
        System.out.println();
        System.out.println("Creating object of class B without parameter: ");
        B b1 = new B();
    }
}
