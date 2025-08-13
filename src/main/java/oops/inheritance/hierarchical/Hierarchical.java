package oops.inheritance.hierarchical;

class A {
    void displayA() {
        System.out.println("Class A");
    }
}

class B extends A {
    void displayB() {
        System.out.println("Class B");
    }
}

class C extends A {
    void displayC() {
        System.out.println("Class C");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        System.out.println("Hierarchical Inheritance");
        System.out.println("Using object of class A: ");
        A obj = new A();
        obj.displayA();

        System.out.println("Using object of class B: ");
        B obj1 = new B();
        obj1.displayA();
        obj1.displayB();

        System.out.println("Using object of class C: ");
        C obj2 = new C();
        obj2.displayA();
        obj2.displayC();
    }
}
