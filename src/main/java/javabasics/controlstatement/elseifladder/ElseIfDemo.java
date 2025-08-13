package javabasics.controlstatement.elseifladder;

public class ElseIfDemo {
    public static void main(String[] args) {
        int a = 10, b = 24, c = 30;
        if (a > b && a > c) {
            System.out.println(a + " is the largest number.");
        } else if (b > a && b > c) {
            System.out.println(b + " is the largest number.");
        } else if (c > a && c > b) {
            System.out.println(c + " is the largest number.");
        }
    }
}
