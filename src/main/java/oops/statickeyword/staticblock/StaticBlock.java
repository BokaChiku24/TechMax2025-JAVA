package oops.statickeyword.staticblock;

public class StaticBlock {
    static int x;
    static int y = 10;
    static {
        System.out.println("Static block called");
        x = 50;
    }
    static void display(){
        System.out.println("x = " + x + ", y = " + y);
    }
    public static void main(String[] args) {
        System.out.println("Before modifying static variables:");
        display();
        System.out.println("Value of x and y: " + StaticBlock.x + " " + StaticBlock.y);
        StaticBlock.x = 100;
        StaticBlock.y = 200;
        System.out.println("After modifying static variables:");
        display();
    }
}
