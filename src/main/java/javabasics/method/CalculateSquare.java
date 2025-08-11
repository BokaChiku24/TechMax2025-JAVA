package javabasics.method;

public class CalculateSquare {
    public static void main(String[] args) {
        CalculateSquare obj = new CalculateSquare();
        obj.calculateSquare(5);
    }

    private void calculateSquare(int i) {
        int square = i * i;
        System.out.println("Square of " + i + " is: " + square);
    }
}
