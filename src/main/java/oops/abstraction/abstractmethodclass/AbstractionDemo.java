package oops.abstraction.abstractmethodclass;

abstract class A{
    public abstract void displayDetails();
    void displayMessage(){
        System.out.println("Abstract class A");
    }
}

class B extends A{
    public void displayDetails(){
        System.out.println("Implementation of displayDetails in class B");
    }

    void check(){
        System.out.println("Implementation of check method in class B");
    }

}

public class AbstractionDemo {
    public static void main(String[] args) {
        System.out.println("Using object of class A: ");
        A obj = new B();
        obj.displayDetails();
        obj.displayMessage();
        // obj.check();   // check method is not accessible from outside the class A
        System.out.println();
        System.out.println("Using object of class B: ");
        B obj1 = new B();
        obj1.displayDetails();
        obj1.check();
        obj1.displayMessage();
    }
}
