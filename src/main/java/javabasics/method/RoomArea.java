package javabasics.method;

class Room{
    private double length;
    private double breadth;
    public void area(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
        System.out.println("Area of the room: " + (length * breadth));
    }
}

public class RoomArea {
    public static void main(String[] args) {
        Room room = new Room();
        room.area(10, 5);
    }
}
