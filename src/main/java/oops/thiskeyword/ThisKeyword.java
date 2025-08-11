package oops.thiskeyword;

public class ThisKeyword {
    int x, y;
    void numbers(int x, int y){
        this.x = x; // 'this' keyword is used to refer to current instance variables
        this.y = y;
        System.out.println("x = " + x + ", y = " + y);
    }
    void displayNumbers(){
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword();
        obj.numbers(10, 20);
        obj.displayNumbers();
    }
}
