package oops.constructor.parameterizedconstructor;

public class Parameter {
    public int a, b;
    public Parameter(int a, int b) {
        System.out.println("Parameterized constructor called");
        this.a = a;
        this.b = b;
    }
    public void display() {
        System.out.println("a = " + a + " b = " + b);
    }
    public static void main(String[] args) {
        Parameter parameter = new Parameter(10, 20);
        parameter.display();
    }
}
