package exceptionhandling.finallyblock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A{
    int x = 10;
    int y = 0;
    A(){
        System.out.println("Constructor of A called");
    }
    void display(){
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
    }
}

public class Demo {
    public static void main(String[] args) {
        int a, b, c = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter two integers:");
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());

            c = a / b;
            System.out.println("Result: " + c);
        }catch (ArithmeticException e) {
            A obj = new A();
            obj.display();
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error reading input: " + e.getMessage());
        }finally {
            System.out.println("Program execution completed.");
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Error closing input stream: " + e.getMessage());
            }
        }
    }
}
