package exceptionhandling.userdefinedexception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int max = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter 5 integers:");
            for(int i = 0; i < arr.length; i++){
                arr[i] = Integer.parseInt(reader.readLine());
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            System.out.println("The maximum number is: " + max);
        }catch (NumberFormatException | IOException e){
            System.out.println("Invalid input! Please enter a valid integer.");
        }
    }
}
