    package javabasics.loop.whileloop;

    public class Fibonacci {
        public static void main(String[] args) {
            int max = 20, prev = 0, next = 1;
            int sum;
            System.out.println("Fibonacci series up to " + max + " terms:");
            System.out.print(prev + " " + next + " ");
            while(next <= max){
                sum = prev + next;
                System.out.print(sum + " ");
                prev = next;
                next = sum;
            }
        }
    }
