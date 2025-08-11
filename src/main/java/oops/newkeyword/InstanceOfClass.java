package oops.newkeyword;

public class InstanceOfClass {
    int a = 10;
    int b = 20;

    public static void main(String[] args) {
        InstanceOfClass obj1 = new InstanceOfClass();
        InstanceOfClass obj2 = new InstanceOfClass();

        System.out.println("obj1 is an instance of InstanceOfClass: " + (obj1 instanceof InstanceOfClass));
        System.out.println("obj2 is an instance of InstanceOfClass: " + (obj2 instanceof InstanceOfClass));

        System.out.println("Number 1 is : " + obj1.a);
        System.out.println("Number 2 is : " + obj2.b);
    }
}
