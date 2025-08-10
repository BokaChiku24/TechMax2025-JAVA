    package javabasics.controlstatement.elseifladder;

    public class CityName {
        public static void main(String[] args) {
            char cityChar = 'P';
            if(cityChar == 'B'){
                System.out.println("City Name: Bangalore");
            }else if(cityChar == 'M'){
                System.out.println("City Name: Mumbai");
            }else if(cityChar == 'P'){
                System.out.println("City Name: Pune");
            }else if(cityChar == 'C'){
                System.out.println("City Name: Chennai");
            }else {
                System.out.println("Invalid city character");
            }
        }
    }
