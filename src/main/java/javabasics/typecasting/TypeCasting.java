package javabasics.typecasting;

public class TypeCasting {

    public static void main(String[] args) {
        int a = 45;
        float b = 1923.7f;
        byte c;

        System.out.println("Converting int into byte:");
        c = (byte) a;
        System.out.println("Value of c: " + c);

        System.out.println("\nConverting float into int:");
        a = (int) b;
        System.out.println("Value of a: " + a);

        System.out.println("\nConverting int into float:");
        b = (float) a;
        System.out.println("Value of b: " + b);
    }



}
