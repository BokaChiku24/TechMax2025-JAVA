package javabasics.loop.forloop;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        int num1, num2, sum;
        for(num1 = 1; num1 <= 10; num1++){
            for(num2 = 1; num2 <= 10; num2++){
                sum = num1 + num2;
                System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
            }
        }
    }
}
