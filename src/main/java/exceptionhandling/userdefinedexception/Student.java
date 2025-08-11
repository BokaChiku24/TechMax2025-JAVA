package exceptionhandling.userdefinedexception;

class MarksOutOfRange extends Exception {
    public MarksOutOfRange(String message) {
        super(message);
    }
}

public class Student {
    int marks;
    public Student(int marks){
        this.marks = marks;
    }
    public void check(){
        try{
            if(marks > 100)
                throw new MarksOutOfRange("Marks cannot be greater than 100");
        }catch(MarksOutOfRange e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){
        Student student = new Student(150);
        student.check();
    }
}
