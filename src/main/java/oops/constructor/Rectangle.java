package oops.constructor;

public class Rectangle {
    int length;
    int breadth;
    Rectangle(int x, int y){
        length = x;
        breadth = y;
    }
    int calculateArea(){
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
    }
}
