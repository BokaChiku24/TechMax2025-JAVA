package javabasics.arrays.twodimenstional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputArray {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        System.out.println("Enter 9 numbers:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    numbers[i][j] = Integer.parseInt(reader.readLine());
                }
            }
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Array Elements Are: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
