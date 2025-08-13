package oops.abstraction.interfaces.implementskeyword;

interface A {
    public void set();
    public void get();
}

class B implements A {
    public void set() {
        System.out.println("Implementation of set method in class B");
    }
    public void get() {
        System.out.println("Implementation of get method in class B");
    }
}

public class InterFacesDemo {
    public static void main(String[] args) {
        System.out.println("Using object of class B: ");
        B obj = new B();
        obj.set();
        obj.get();
    }
}
