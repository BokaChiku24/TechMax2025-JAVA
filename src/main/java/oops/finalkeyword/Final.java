package oops.finalkeyword;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Final {
    public static final int MAX_VALUE = 100;
    public static final float PI = 3.14f;
    private int r;
    public void getRadius(){
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the radius: ");
            r = Integer.parseInt(bufferedReader.readLine());
            if(r > MAX_VALUE){
                throw new Exception("Radius should not be greater than " + MAX_VALUE);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void circum(){
        float c = 2 * PI * r;
        System.out.println("Circumference: " + c);
    }

    public void area(){
        float a = PI * r * r;
        System.out.println("Area: " + a);
    }

    public static void main(String[] args) {
        Final obj = new Final();
        obj.getRadius();
        obj.circum();
        obj.area();
    }
}
