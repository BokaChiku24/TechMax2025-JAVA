package oops.inheritance.multiple;

class Student{
    int rollNumber;
    void getRollNumber(int n){
        rollNumber = n;
    }
    void displayDetails(){
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Test extends Student{
    float marks1, marks2;
    void getMarks(float m1, float m2){
        marks1 = m1;
        marks2 = m2;
    }
    void displayMarks(){
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
    }
}

interface Sports{
    float sportWt = 10.5f;
    void printSportWt();
}

class Result extends Test implements Sports{
    float total;
    public void printSportWt(){
        System.out.println("Sport Weightage: " + sportWt);
    }
    void displayResult(){
        total = marks1 + marks2;
        System.out.println("Total Marks: " + total);
        displayDetails();
        displayMarks();
    }
}

public class Hybrid {
    public static void main(String[] args) {
        Result result = new Result();
        result.getRollNumber(101);
        result.getMarks(85.5f, 92.5f);
        result.printSportWt();
        result.displayResult();
    }
}
