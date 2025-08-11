    package oops.accessmodifiers.challangeone.stringoperation;

    import java.io.BufferedReader;
    import java.io.InputStreamReader;

    public class StringCompare {
        int compareStrings(String str1, String str2) {
            return str1.compareTo(str2);
        }

        public static void main(String[] args) {
            StringCompare obj = new StringCompare();
            int result = obj.compareStrings("Hello", "World");
            System.out.println("Comparison result: " + result);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String str1, str2;
            try {
                System.out.print("Enter first string: ");
                str1 = bufferedReader.readLine();
                System.out.print("Enter second string: ");
                str2 = bufferedReader.readLine();
                result = obj.compareStrings(str1, str2);
                System.out.println("Comparison result: " + result);

                if (result == 0) {
                    System.out.println("Strings are equal");
                } else {
                    System.out.println("Strings are not equal");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
