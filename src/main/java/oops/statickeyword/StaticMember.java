package oops.statickeyword;

public class StaticMember {
    static void evenOdd(int num){
        if(num % 2 == 0){
            System.out.println(num + " is an even number");
        } else{
            System.out.println(num + " is an odd number");
        }
    }

    public static void main(String[] args) {
        StaticMember.evenOdd(10);
        StaticMember.evenOdd(15);
    }
}
