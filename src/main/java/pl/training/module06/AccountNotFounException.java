package pl.training.module06;

public class AccountNotFounException extends Exception {

    private String accountNumber = "";

    public AccountNotFounException(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountNotFounException() {
        this("");
    }
}
