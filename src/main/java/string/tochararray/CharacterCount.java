package string.tochararray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterCount {
    public static void main(String[] args) throws IOException {
        String string;
        int i, count = 0;
        char ch;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string:");
        string = reader.readLine();
        System.out.println("Enter a character to count:");
        ch = (char) reader.read();
        char chrArray[] = string.toCharArray();
        for(i = 0; i < chrArray.length; i++) {
            if(chrArray[i] == ch) {
                count++;
            }
        }
        System.out.println("Character '" + ch + "' appears " + count + " times in the string.");
    }
}
