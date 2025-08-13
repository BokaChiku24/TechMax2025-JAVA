package javabasics.method.argumentpassing;

import java.util.Scanner;

class Operations {
    void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    void subtract(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }
}

public class Parameters {
    public static void main(String[] args) {
        int num1, num2, num3, num4;
        System.out.println("Enter four numbers:");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();
        Operations operations = new Operations();
        operations.add(num1, num2);
        operations.subtract(num3, num4);
        scanner.close();
        System.out.println("Program completed");
    }
}
