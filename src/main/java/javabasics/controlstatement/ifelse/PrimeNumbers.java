package javabasics.controlstatement.ifelse;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n, p;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = scanner.nextInt();
        System.out.println("Prime numbers from 1 to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
