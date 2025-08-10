    package javabasics.controlstatement.switchcase;

    public class Season {
        public static void main(String[] args) {
            int month = 4;
            switch (month) {
                case 1, 2, 3 -> System.out.println("Summer is around the corner");
                case 4, 5, 6 -> System.out.println("Spring is around the corner");
                case 7, 8, 9 -> System.out.println("Autumn is around the corner");
                case 10, 11, 12 -> System.out.println("Winter is around the corner");
                default -> System.out.println("Invalid month");
            }
        }
    }
