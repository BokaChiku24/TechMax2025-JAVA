package javabasics.operators.typecasting;

public class TypeCasting {
    public static void main(String[] args) {
        float sum;
        int i = 1;
        sum = 0.0F;
        sum = sum + i / (float) i;
        System.out.println("Sum: " + sum);
    }
}
