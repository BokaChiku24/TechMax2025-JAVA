package exceptionhandling.userdefinedexception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Account {
    int accountNumber;
    String name;
    int balance;

    Account(int accountNumber, String name, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }
}

class CheckName extends Exception {
    public CheckName(String message) {
        super(message);
    }
}

class CheckBalance extends Exception {
    public CheckBalance(String message) {
        super(message);
    }
}

public class Bank {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String s;
            System.out.print("Enter account balance: ");
            s = bufferedReader.readLine();

            int balance = Integer.parseInt(s);
            System.out.print("Enter your name: ");
            String name = bufferedReader.readLine();

            for (int i = 0; i < name.length(); i++) {
                if (name.indexOf(i) != -1) {
                    throw new CheckName("Invalid name. Name should not contain any special characters.");
                }
            }
            if (balance > 1000 && balance < 5000) {
                throw new CheckBalance("Invalid balance. Balance should be between 1000 and 5000.");
            }

        }catch(CheckName e){
            throw new RuntimeException(e);
        } catch (CheckBalance e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
