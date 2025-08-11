package oops.accessclassmember;

public class AccessClassMember {
    int x = 4, y = 8, z = 14;

    void calculateAverage(){
        int average = (x + y + z) / 3;
        System.out.println("Average of x, y, and z is: " + average);
    }
    public static void main(String[] args) {
        AccessClassMember obj = new AccessClassMember();
        obj.calculateAverage();
    }
}
