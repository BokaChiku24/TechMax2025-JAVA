package exceptionhandling.userdefinedexception;

public class Coordinate extends Exception {

    public int x = 0, y = 0, z = 0;

    public Coordinate(String message) {
        super(message);
    }

    public Coordinate() {
        System.out.println("Default constructor called");
    }

    public Coordinate(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void displayCoordinates() {
        System.out.println("Coordinates: (" + x + ", " + y + ", " + z + ")");
    }

    public void addCoordinates(Coordinate c1, Coordinate c2, Coordinate c3) {
        x = c1.x + c2.x + c3.x;
        y = c1.y + c2.y + c3.y;
        z = c1.z + c2.z + c3.z;
        try {
            if (x == 0 && y == 0 && z == 0) {
                throw new Coordinate("All coordinates are zero");
            }
        } catch (Coordinate e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Coordinate c1 = new Coordinate(10, 20, 30);
        Coordinate c2 = new Coordinate(40, 50, 60);
        Coordinate c3 = new Coordinate(70, 80, 90);

        Coordinate c4 = new Coordinate();

        c4.addCoordinates(c1, c2, c3);
        c4.displayCoordinates();
    }
}
