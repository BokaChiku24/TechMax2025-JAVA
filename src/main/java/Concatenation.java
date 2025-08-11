import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Concatenation {
    String str1;
    String str2;
    Concatenation(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    String concatenateStrings() {
        return str1 + " " + str2;
    }

    String concatenateOfStrings() {
        System.out.println("Please enter two strings: ");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            str1 = reader.readLine();
            str2 = reader.readLine();
            return str1.concat(" ").concat(str2);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    public static void main(String[] args) {
        Concatenation obj = new Concatenation("Hello", "World");
        System.out.println("Concatenated string: " + obj.concatenateStrings());
        System.out.println("Concatenated string: " + obj.concatenateOfStrings());
    }
}
