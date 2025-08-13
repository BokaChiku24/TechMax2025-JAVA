package regexpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class validates email addresses using regular expressions.
 * @author Kunal
 */

public class EmailValidates {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the email address: ");
        String email = reader.readLine();
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
        Matcher matcher = pattern.matcher(email);
        boolean isValid = matcher.matches();
        if(isValid)
        System.out.println("Valid email address! " + email);
        else
            System.out.println("Invalid email address! " + email);
        reader.close();
    }


}
