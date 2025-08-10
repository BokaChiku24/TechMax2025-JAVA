    package javabasics.breakstatement;

    public class LabelBreak {
        public static void main(String[] args) {
            boolean flag = true;
            a:
            {
                b:
                {
                    c:
                    {
                        System.out.println("Inside the c block");
                        if (flag) {
                            break b;
                        }
                        System.out.println("This will not execute");
                    }
                    System.out.println("This will also not execute");
                }
            }
            System.out.println("This is after b");
        }
    }
