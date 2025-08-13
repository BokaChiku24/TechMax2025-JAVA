package file.filewriter;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("sample.txt");
            char c = 'A';
            fileWriter.write(c);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
