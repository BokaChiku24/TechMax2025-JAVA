    package javabasics.controlstatement.switchcase;

    public class SwitchNumber {
        public static void main(String[] args) {
            int number = 3;
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                default:
                    System.out.println("Invalid number");
                    break;
            }
        }
    }
