package oops.polymorphism.dynamicmethoddispatch;

class A{
    void callMe(){
        System.out.println("Class A's callMe method");
    }
}

class B extends A{
    void callMe(){
        System.out.println("Class B's callMe method");
    }
}

class C extends A{
    void callMe(){
        System.out.println("Class C's callMe method");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A obj; // Obtain a reference of type A
        obj = a; // obj can refer to object of class A
        obj.callMe(); // Calls class A's callMe method'
        obj = b; // obj can refer to object of class B
        obj.callMe(); // Calls class B's callMe method'
        obj = c; // obj can refer to object of class C
        obj.callMe(); // Calls class C's callMe method'
    }
}
