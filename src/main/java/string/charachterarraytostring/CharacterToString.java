package string.charachterarraytostring;

public class CharacterToString {
    public static void main(String[] args) {
        char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
        String string = new String(charArray);
        System.out.println(string);
        String string2 = new String(string);
        System.out.println(string2);

        byte[] ascii = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100};
        String string3 = new String(ascii);
        System.out.println(string3);
    }
}
