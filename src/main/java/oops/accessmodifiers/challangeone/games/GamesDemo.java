package oops.accessmodifiers.challangeone.games;

public class GamesDemo {

    public static void main(String[] args) {
        InDoor indoor = new InDoor("Bat", "Ball", "Racket", "Stick", "Carrom Table");
        OutDoor outdoor = new OutDoor("Cricket Ball", "Hockey Stick", "Football", "Rugby Ball", "Net");
        indoor.displayCarrom();
        outdoor.displayFootballTeams();
    }
}
