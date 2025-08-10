package javabasics.variablescope;

public class VariableScope {
    public static void main(String args[]){
        int a = 10;
        {
            int b = 20;
            System.out.println("a and b both are accessible here");
            System.out.println("a = " + a + " b = " + b);
        }
        // block and scope of b ends here. only a is available here
        // System.out.println("b = " + b); // Error: b is not accessible here
        System.out.println("a = " + a);
    }
}
