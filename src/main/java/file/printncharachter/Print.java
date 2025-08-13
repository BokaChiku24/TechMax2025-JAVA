package file.printncharachter;

import java.io.File;
import java.io.FileInputStream;

public class Print {
    public static void main(String[] args) {
        File file = new File("sample.txt");
        int ch, n;
        n = Integer.parseInt(args[0]);
        StringBuffer content = new StringBuffer(" ");
        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream(file);
            for (int i = 0; (ch = fileInputStream.read())!= -1; i++) {
                if(i == n)
                content.append((char) ch);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Character at position "+n+": "+content);
    }
}
