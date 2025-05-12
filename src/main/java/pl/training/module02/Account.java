package pl.training.module02;

public class Account {

    String number;
    double balance; //domyslnie 0.0
    boolean isActive; //domyślnie false

//    public Account() {
//        isActive = true;
//        System.out.println("New account created");
//    }

    public void printBalance() {
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }


}
