package pl.training.module06.model;

import java.util.Objects;

public class Account {

    private final String number;
    protected Money balance;

    public Account(String number, Money balance) {
        this.number = number; //"this" oznacza bieżący obiekt. "Weź mi z bieżącego obiektu number i przypisz do niego to co podaję w wywołaniu metody"
        this.balance = balance;
    }

    public void deposit(Money amount) {
//        this.balance = this.balance.add(amount); // teoretycznie można by tak napisać, ale nikt tak nie pisze, ale jest to poprawne
        balance = balance.add(amount);
    }

    public void withdraw(Money amount) throws InsufficientFoundsException {
        if (amount.isGreaterThanOrEqual(balance)) {
//            throw new IllegalArgumentException("Insufficient funds");
            throw new InsufficientFoundsException();
        }
        balance = balance.subtract(amount);
    }

    private void checkBalance(Money amount) throws InsufficientFoundsException {
        if (amount.isGreaterThanOrEqual(balance)) {
            throw new InsufficientFoundsException();
        }
    }

    public String getNumber() {
        return number;
    }

    public Money getBalance() {
        return balance;
    }

    public boolean hasNumber(String number) {
        return this.number.equals(number);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(number, account.number) && Objects.equals(balance, account.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, balance);
    }
}
