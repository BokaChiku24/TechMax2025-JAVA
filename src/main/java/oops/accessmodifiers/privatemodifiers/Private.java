package oops.accessmodifiers.privatemodifiers;

public class Private {
    private int rollNo = 101;
    private String name = "John Doe";
    public void displayDetails(){
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        Private obj = new Private();
        obj.displayDetails();
    }
}
