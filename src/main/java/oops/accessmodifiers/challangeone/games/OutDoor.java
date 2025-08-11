package oops.accessmodifiers.challangeone.games;

public class OutDoor {
    String[] football = new String[5];
    public OutDoor(String a, String b, String c, String d, String e) {
        football[0] = a;
        football[1] = b;
        football[2] = c;
        football[3] = d;
        football[4] = e;
    }
    public void displayFootballTeams() {
        for (String team : football) {
            System.out.println(team);
        }
    }
}
