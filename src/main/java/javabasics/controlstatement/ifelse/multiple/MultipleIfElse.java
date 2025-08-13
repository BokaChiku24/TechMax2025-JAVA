package javabasics.controlstatement.ifelse.multiple;

public class MultipleIfElse {
    public static void main(String[] args) {
        int a = 10, b = 24;
        if(a > b) {
            System.out.println(a + " is greater than " + b);
        }else{
            System.out.println(a + " is less than or equal to " + b);
        }
        if(b > a) {
            System.out.println(b + " is greater than " + a);
        }else{
            System.out.println(b + " is less than or equal to " + a);
        }
    }
}
