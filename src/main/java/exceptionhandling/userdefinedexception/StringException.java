package exceptionhandling.userdefinedexception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class CountNumber extends Exception {}
class LesserString extends Exception {}
class GreaterString extends Exception {}

public class StringException {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int i;

    public static void main(String[] args) {
        try{
            System.out.println("Enter a String: ");
            String s = br.readLine();
            int n = s.length();

            if(n >= 0 && n <=5){
                throw new LesserString();
            }else if(n > 10){
                throw new GreaterString();
            }
            for (char c : s.toCharArray()) {
                if(Character.isDigit(c)){
                    throw new CountNumber();
                }
            }
        }catch(LesserString e){
            System.out.println("String is less than or equal to 5 characters long.");
        }catch (GreaterString e){
            System.out.println("String is greater than 10 characters long.");
        }catch (CountNumber e){
            System.out.println("String contains digit(s).");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            System.exit(0);
        }
    }
}
