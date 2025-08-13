package exceptionhandling.userdefinedexception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MarksOutOfBoundsException extends Exception {
    public MarksOutOfBoundsException(String message) {
        super(message);
    }
}

public class Marks {
    public static void main(String[] args) {
        int marks;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter marks: ");
            marks = Integer.parseInt(br.readLine());

            if (marks < 0 || marks > 100) {
                throw new MarksOutOfBoundsException("Invalid marks. Please enter between 0 and 100.");
            }

            System.out.println("Valid marks entered.");
        } catch (MarksOutOfBoundsException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
