package exceptionhandling.userdefinedexception;

class InvalidArgumentException extends Exception {
    public InvalidArgumentException(String message) {
        super(message);
    }
}

public class InvalidArgument {
    public static void main(String[] args) {
        int a, b;
        try{
            if(args.length!=2){
                throw new InvalidArgumentException("Invalid number of arguments. Expected 2 but received " + args.length);
            }
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            System.out.println("Addition: " + (a+b));
            System.out.println("Subtraction: " + (a-b));
            System.out.println("Multiplication: " + (a*b));
            System.out.println("Division: " + (a/b));
            System.out.println("Modulus: " + (a%b));
            System.out.println("Square Root: " + Math.sqrt(a));
        }catch(InvalidArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
