package oops.accessmodifiers.protectedmodifier;

class Student{
    protected int rollNo = 101;
    protected String name = "John Doe";
}

public class ProtectedTest extends Student{
    private String status = "Pass";
    public void displayDetails(){
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Status: " + status);
    }
    public static void main(String[] args) {
        ProtectedTest obj = new ProtectedTest();
        obj.displayDetails();
    }
}
