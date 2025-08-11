    package oops.accessmodifiers.challangeone.stringoperation;

    import java.io.BufferedReader;
    import java.io.InputStreamReader;

    public class StringConcatenation {
        public static String concatenateStrings(String str1, String str2) {
            return str1.concat(str2);
        }

        public static void main(String[] args) {
            StringConcatenation obj = new StringConcatenation();
            String result = obj.concatenateStrings("Hello", " World");
            System.out.println("Concatenated string: " + result);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String str1, str2;
            try {
                System.out.print("Enter first string: ");
                str1 = bufferedReader.readLine();
                System.out.print("Enter second string: ");
                str2 = bufferedReader.readLine();
                result = obj.concatenateStrings(str1, str2);
                System.out.println("Concatenated string: " + result);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
