package oops.inheritance.multilevel;

class A{
    void display(){
        System.out.println("Class A");
    }
}

class B extends A{
    void get(){
        System.out.println("Class B");
    }
}

class C extends B{
    void check(){
        System.out.println("Class C");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        System.out.println("Multi-level Inheritance");
        System.out.println("Using object of class A: ");
        A obj = new A();
        obj.display();

        System.out.println("Using object of class B: ");
        B obj1 = new B();
        obj1.display();
        obj1.get();

        System.out.println("Using object of class C: ");
        C obj2 = new C();
        obj2.display();
        obj2.get();
        obj2.check();

    }
}
