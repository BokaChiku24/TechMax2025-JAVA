    package oops.inheritance.single;

    import java.io.BufferedReader;
    import java.io.InputStreamReader;

    class Number{
        protected int number;
        void getNumber(){
            try{
                System.out.print("Enter a number: ");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                number = Integer.parseInt(bufferedReader.readLine());
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
    }

    public class Square extends Number{
        public void calculateSquare(){
            getNumber();
            System.out.println("Square of the number: " + number * number);
        }
        public static void main(String[] args) {
            Square obj = new Square();
            obj.calculateSquare();
        }
    }
