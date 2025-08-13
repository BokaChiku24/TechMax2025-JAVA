package oops.polymorphism.methodoverloading;

public class MethodOverloading {
    public void method(){
        System.out.println("No arguments");
    }
    public void method(int a){
        System.out.println("One argument: " + a);
    }
    public void method(int a, int b){
        System.out.println("Two arguments: " + a + " " + b);
    }
    public void method(double a, double b){
        System.out.println("Two arguments: " + a + " " + b);
    }
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.method();
        obj.method(5);
        obj.method(5, 10);
        obj.method(5.5d, 10.5d);
    }
}
