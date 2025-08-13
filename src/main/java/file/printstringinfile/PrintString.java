package file.printstringinfile;

import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintString {
    public static void main(String[] args) throws IOException {
        File file = new File("sample.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string to print:");
        int n = Integer.parseInt(reader.readLine());
        String[] lines = new String[n];
        for(int i = 0; i < n; i++){
            lines[i] = reader.readLine();
        }
        for(int i = 0; i < n; i++) {
            if (lines[i].startsWith("A") && lines[i].endsWith("OBJ")) {
                FileUtils.writeStringToFile(file, lines[i]);
            }
        }
    }
}
