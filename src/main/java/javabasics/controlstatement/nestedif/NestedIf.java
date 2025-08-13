package javabasics.controlstatement.nestedif;

public class NestedIf {
    public static void main(String[] args) {
        int a = 150, b = 100, c = 50;
        System.out.println("The maximum number among " + a + ", " + b + ", and " + c + " is:");
        if(a > b){
            if (a > c){
                System.out.println(a + " is the largest");
            }
        }
        if(b > c){
            if(b > a){
                System.out.println(b + " is the largest");
            }
        }
        if(c > a){
            if(c > b){
                System.out.println(c + " is the largest");
            }
        }
    }
}
