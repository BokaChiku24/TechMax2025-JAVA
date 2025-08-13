package oops.statickeyword;

public class StaticClass {
    static int x;
    static int y = 10;

    static void display(){
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        System.out.println("Before modifying static variables:");
        display();
        System.out.println("Value of x and y: " + StaticClass.x + " " + StaticClass.y);
        StaticClass.x = 50;
        StaticClass.y = 150;
        System.out.println("After modifying static variables:");
        display();
    }
}
