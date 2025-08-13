package exceptionhandling.userdefinedexception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Age {
    public static void main(String[] args) {
        int age;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter age: ");
            age = Integer.parseInt(br.readLine());

            if (age < 0 || age > 150) {
                throw new InvalidAgeException("Invalid age. Please enter between 0 and 150.");
            }

            System.out.println("Valid age entered.");

            if (age >= 18 && age <= 40) {
                System.out.println("Age is between 18 and 40.");
            }

            if (age >= 41 && age <= 60) {
                System.out.println("Age is between 41 and 60.");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}
