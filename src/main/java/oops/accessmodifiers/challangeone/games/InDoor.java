package oops.accessmodifiers.challangeone.games;

public class InDoor {
    String[] carrom = new String[5];

    public InDoor(String p, String q,
                  String s, String t, String r) {
        carrom[0] = p;
        carrom[1] = q;
        carrom[2] = s;
        carrom[3] = t;
        carrom[4] = r;
    }
    public void displayCarrom() {
        for (String carromPiece : carrom) {
            System.out.println(carromPiece);
        }
    }
}
