package file.readwrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileDemo {
    public static void main(String[] args) {
        int i;
        FileInputStream f1;
        FileOutputStream f2;

        try {
            f1 = new FileInputStream(args[0]);
            f2 = new FileOutputStream(args[1]);
            do {
                i = f1.read();
                if (i != 1) {
                    f2.write(i);
                }
            } while (i != -1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
