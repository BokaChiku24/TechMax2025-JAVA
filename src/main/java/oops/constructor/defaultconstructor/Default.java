package oops.constructor.defaultconstructor;

public class Default {
    public int a, b;

    public Default() {
        System.out.println("Default constructor called");
        a = 10;
        b = 20;
    }

    public void display() {
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        Default obj = new Default();
        obj.display();
    }
}
