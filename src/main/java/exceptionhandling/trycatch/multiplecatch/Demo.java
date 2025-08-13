package exceptionhandling.trycatch.multiplecatch;

public class Demo {
    public static void main(String[] args) {
        int c, b[];
        int a = Integer.parseInt(args[0]); // Input a as command-line argument - This will throw NumberFormatException
        try {
            if (a % 2 == 0) {
                c = 10 / 0; // This will throw ArithmeticException
            } else {
                b = new int[a]; // This will throw ArrayIndexOutOfBoundsException
                b[a] = 5; // This will throw ArrayStoreException
            }
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
    }
}

