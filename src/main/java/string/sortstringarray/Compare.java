package string.sortstringarray;

public class Compare {
    static String[] array = {"The","Enterprise","JavBean","Extends","Java",
            "Application","To","the","new","functionality","and","specification"};
    public static void main(String[] args) {
        for(int i = 0; i<array.length; i++){
            for(int j = i + 1; j<array.length; j++){
                if(array[i].compareToIgnoreCase(array[j]) > 0){
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Sorted array in ascending order:");
         for(String word : array){
            System.out.println(word);
        }
    }
}
