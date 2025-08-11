package javabasics.arrays.onedimensinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        int max = array[0];
        int num;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter 5 integers:");
            for (int i = 1; i < array.length - 1; i++) {
                num = Integer.parseInt(bufferedReader.readLine());
                array[i] = num;
                if (num > max) {
                    max = num;
                }
            }
            System.out.println("Maximum number in the array: " + max);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
