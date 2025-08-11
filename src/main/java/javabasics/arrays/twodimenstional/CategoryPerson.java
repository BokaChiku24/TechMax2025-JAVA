package javabasics.arrays.twodimenstional;

public class CategoryPerson {
    public static void main(String[] args) {
        int i = 0;
        int total = 0;
        int selected = 0;
        int other = 0;
        float[] weights = {65.5f, 72.3f, 58.7f, 69.2f, 75.1f, 8.90f, 90.89f, 101.78f};
        float[] heights = {1.75f, 1.68f, 1.72f, 1.70f, 1.65f, 1.4f, 2.8f};
        for(; i<= 6; i++){
            if(weights[i] >= 60 && heights[i] >= 1.70){
                selected++;
            }
            total++;
        }
        other = total - selected;
        System.out.println("Total number of people: " + total);
        System.out.println("Number of people selected: " + selected);
        System.out.println("Number of people who are not selected: " + other);
    }
}
