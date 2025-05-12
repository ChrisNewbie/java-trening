package pl.training.module02;

import java.util.Date;

public class BankClient {
    public Date dateOfBirth;
    String name;
    String surname;
    String email;



    public void printBankClientInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Email: " + email);
    }
}
