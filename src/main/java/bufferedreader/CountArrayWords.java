package bufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountArrayWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence:");
        String sentence = reader.readLine();
        String[] words = sentence.split("\\s+");
        int count = words.length;
        System.out.println("Number of words in the sentence: " + count);

        for(int i = words.length-1; i>=0; i--){
            System.out.print(words[i] + " ");
        }
    }
}
