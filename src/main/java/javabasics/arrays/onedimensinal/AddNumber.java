package javabasics.arrays.onedimensinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AddNumber {
    public static void main(String[] args) throws IOException {
        int[] numbers = new int[4];
        int x = numbers.length;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter " + x + " numbers:");
        for(int i = 0; i < x; i++) {
            numbers[i] = Integer.parseInt(bufferedReader.readLine());
        }
        Arrays.sort(numbers);   // Sorting the array in ascending order
        System.out.println("Entered numbers:");
       for(int i = 0; i < x; i++){
           System.out.println(numbers[i]);
       }
    }
}
