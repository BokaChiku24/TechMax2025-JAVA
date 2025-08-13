package oops.accessclassmember;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int num, num2;

    void accept() throws IOException {
        System.out.print("Enter first number: ");
        num = Integer.parseInt(bufferedReader.readLine());

        System.out.print("Enter second number: ");
        num2 = Integer.parseInt(bufferedReader.readLine());
    }

    void display() {
        System.out.println("First number: " + num);
        System.out.println("Second number: " + num2);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        Demo obj = new Demo();
        try {
            demo.accept();
            demo.display();
            obj.accept();
            obj.display();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
