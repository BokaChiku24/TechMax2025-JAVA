        package javabasics.loop.forloop;

        /*
        5
      4   5
    3   4   5
  2   3   4   5
1   2   3   4   5

5   4   3   2   1
  4   3   2   1
    3   2   1
      2   1
        1
         */
        public class PrintTriangle {
            public static void main(String[] args) {
                System.out.println();
                code();
                System.out.println();
                code2();
            }

            public static void code() {
                int n = 5;
                for (int i = 1; i <= n; i++) {
                    // Print leading spaces
                    for (int s = 1; s <= n - i; s++) {
                        System.out.print("  ");
                    }
                    // Print numbers
                    for (int j = n - i + 1; j <= n; j++) {
                        System.out.print(j + "   ");
                    }
                    System.out.println();
                }
            }

            public static void code2(){
                int n = 5;
                for (int i = 0; i < n; i++) {
                    // Print leading spaces
                    for (int s = 0; s < i; s++) {
                        System.out.print("  ");
                    }
                    // Print numbers in decreasing order
                    for (int j = n - i; j >= 1; j--) {
                        System.out.print(j + "   ");
                    }
                    System.out.println();
                }
            }
        }

