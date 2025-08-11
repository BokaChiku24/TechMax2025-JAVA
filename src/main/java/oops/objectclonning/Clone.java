package oops.objectclonning;

class Student implements Cloneable{
    int rollNumber;
    String name;
    float marks;
    Student(int rollNumber, String name, float marks){
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }
    public Student clone(){
        try{
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    public String toString(){
        return "Student [rollNumber=" + rollNumber + ", name=" + name + ", marks=" + marks + "]";
    }
}

public class Clone {
    public static void main(String[] args) {
        Student student = new Student(101, "John Doe", 85.5f);
        Student clonedStudent = student.clone();
        System.out.println("Original Student: " + student);
        System.out.println("Cloned Student: " + clonedStudent);
        clonedStudent.marks = 90.0f;
        System.out.println("Updated Cloned Student: " + clonedStudent);
        System.out.println("Original Student: " + student); // The original student's marks are also updated
    }
}
