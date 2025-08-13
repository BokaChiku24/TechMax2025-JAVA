package javabasics.controlstatement.ifstatement;

public class MultipleIf {
    public static void main(String[] args) {
        int a = 10, b = 24;
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        }
        if (a < b) {
            System.out.println(a + " is less than " + b);
        }
        if (a == b) {
            System.out.println(a + " is equal to " + b);
        }
        if (a != b) {
            System.out.println(a + " is not equal to " + b);
        }
        if (b > a) {
            System.out.println(b + " is greater than " + a);
        }
    }


}
