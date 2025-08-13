package javabasics.continuestatement;

public class SkipNumber {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
               // Skip even numbers
                i++;
                continue;
            }
            System.out.println(i + " is an odd number");
            i++;
        }
    }
}
