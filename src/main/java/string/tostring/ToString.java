package string.tostring;

class Circle{
    double radius;
    double circumference;
    Circle(double radius, double circumference){
        this.radius = radius;
        this.circumference = circumference;
    }

    public String toString(){
        return ("Radius: " + radius + "\nCircumference: " + circumference);
    }
}

public class ToString {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, 31.4159);
        System.out.println(circle);
        String string = "Circle circumference is: " + circle;
        System.out.println(string);
    }
}
