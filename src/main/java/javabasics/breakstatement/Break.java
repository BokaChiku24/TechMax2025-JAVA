package javabasics.breakstatement;

public class Break {
    public static void main(String[] args) {
        int i = 1;
        for (; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Number: " + i);
        }
        System.out.println("Loop terminated");
    }
}
