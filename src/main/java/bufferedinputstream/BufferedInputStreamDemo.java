    package bufferedinputstream;

    import java.io.BufferedInputStream;
    import java.io.ByteArrayInputStream;
    import java.io.IOException;

    public class BufferedInputStreamDemo {
        public static void main(String[] args) throws IOException {
            String string = "Hello World!";
            byte[] bytes = string.getBytes();
            System.out.println("Original string: " + string);
            System.out.println("String length: " + bytes.length);
            boolean marked = false;
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream);
            int c;
            while ((c = bufferedInputStream.read())!= -1) {
                switch (c){
                    case 'M':
                        if (!marked) {
                            marked = true;
                            bufferedInputStream.mark(32);
                            System.out.println("M");
                        }else{
                            System.out.println((char) c);
                            break;
                        }
                    case ';':
                        bufferedInputStream.reset();
                        break;
                    default:
                        System.out.println((char) c);
                }
            }
        }
    }
