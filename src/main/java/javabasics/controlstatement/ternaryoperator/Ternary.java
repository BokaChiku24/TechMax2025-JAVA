    package javabasics.controlstatement.ternaryoperator;

    public class Ternary {
        public static void main(String[] args) {
            int i = 10;
            int j = 24;
            int result = ((i < j) ? i : j);
            System.out.println("The minimum number is: " + result);
        }
    }
