package exceptionhandling.userdefinedexception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class BelowNormal extends Exception {}
class Normal extends Exception {}
class AboveNormal extends Exception {}

public class Temperature {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        float temperature = 0f;
        try{
            System.out.print("Enter temperature: ");
            temperature = Float.parseFloat(br.readLine());

            if(temperature < 0)
                throw new BelowNormal();
            else if(temperature >= 0 && temperature <= 50)
                throw new Normal();
            else
                throw new AboveNormal();
        }catch (BelowNormal bn){
            System.out.println("Temperature is below normal");
        }catch (Normal n){
            System.out.println("Temperature is normal");
        }catch (AboveNormal an){
            System.out.println("Temperature is above normal");
        } catch (Exception e) {
                throw new RuntimeException(e);
        }finally {
            try {
                br.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

}
