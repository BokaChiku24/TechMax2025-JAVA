    package javabasics.controlstatement.nestedif;

    public class NestingIf {
        public static void main(String[] args) {
            int a = 150, b = 100, c = 50;
            System.out.println("The maximum number among " + a + ", " + b + ", and " + c + " is:");
            if(a > b){
                if (a > c){
                    System.out.println(a);
                }else{
                    System.out.println(c);
                }

            }else{
                if(b > c){
                    System.out.println(b);
                }else{
                    System.out.println(c);
                }
            }
        }
    }
