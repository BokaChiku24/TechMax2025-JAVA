package oops.abstraction.interfaces;

interface Result{
    public final static float PI = 3.14f;
    public float compute(float x, float y);
}

class Addition implements Result{
    public float compute(float x, float y){
        return x + y;
    }
}
class CircleArea implements Result{
    public float compute(float radius, float y){
        return PI * radius * radius;
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        Result addition = new Addition();
        Result circleArea = new CircleArea();

        System.out.println("Addition: " + addition.compute(5, 3));
        System.out.println("Circle Area: " + circleArea.compute(5, 0));
    }
}
