package oops.polymorphism.methodoverloading;

public class Overlaod {
    void add(int a, int b){
        System.out.println("Addition of two integers: " + (a + b));
    }
    void add(double a, double b){
        System.out.println("Addition of two doubles: " + (a + b));
    }
    void add(String a, String b){
        System.out.println("Addition of two strings: " + (a + " " + b));
    }
    public static void main(String[] args) {
        Overlaod obj = new Overlaod();
        obj.add(5, 10);
        obj.add(5.5, 10.5);
        obj.add("Hello", "World");
    }
}
