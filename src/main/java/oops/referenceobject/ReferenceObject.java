package oops.referenceobject;

public class ReferenceObject {
    int x, y;

    public static void main(String[] args) {
        ReferenceObject obj1 = new ReferenceObject(); // 'obj1' is the object of ReferenceObject class
        obj1.x = 10;
        obj1.y = 20;
        System.out.println("Object 1: x = " + obj1.x + ", y = " + obj1.y);

        ReferenceObject obj2 = obj1; // 'obj2' is a reference to 'obj1'
        System.out.println("Object 2: x = " + obj2.x + ", y = " + obj2.y);
        obj2.x = 30;
        obj2.y = 40;
        System.out.println("Object 1: x = " + obj1.x + ", y = " + obj1.y);
        System.out.println("Object 2: x = " + obj2.x + ", y = " + obj2.y);

    }
}
