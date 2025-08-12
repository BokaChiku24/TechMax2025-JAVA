package string.stringorderlogic;

public class StringOrderLogic {
    static String[] name = {"Java", "Python", "JavaScript", "Ruby", "C++", "C", "PHP"};

    public static void main(String[] args) {
        int size = name.length;
        String temp = null;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (name[j].compareTo(name[i]) < 0) {
                    temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        for (int k = 0; k < size; k++) {
            System.out.println(name[k]);
        }
    }
}
