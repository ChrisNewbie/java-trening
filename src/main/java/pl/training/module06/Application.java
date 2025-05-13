package pl.training.module06;

import pl.training.module06.model.*;
import pl.training.module06.model.*;
import pl.training.module06.repository.AccountRepository;
import pl.training.module06.repository.ArrayAccountRepository;

import javax.security.auth.login.AccountNotFoundException;

public class Application {

    private static final Currency DEFAULT_CURRENCY = Currency.PLN;


/*    public static void main(String[] args) {
        var pln = Currency.PLN;
        var eur = Currency.EUR;
        var usd = Currency.USD;
        System.out.printf("Current currency: %s\n", pln);
        System.out.printf("Current currency: %s\n", eur);
        System.out.printf("Current currency: %s\n", usd);


    / /        new Money(new BigDecimal(1), pln);
        var money = new Money(new BigDecimal(10), pln);
        System.out.println(money);


    }*/

    /*    public static void main(String[] args) {
            var money = Money.of(10, DEFAULT_CURRENCY);
            var othermoney = Money.of(20, Currency.USD);
            System.out.println(money.add(othermoney));
        }   */

    public static void main(String[] args) {
/*        var money = Money.of(30, DEFAULT_CURRENCY);
        var othermoney = Money.of(20, DEFAULT_CURRENCY);
        System.out.println(money.add(othermoney));
        System.out.println(money.subtract(othermoney));
        System.out.println(money.isGreaterThanOrEqual(othermoney));*/

        AccountNumberGenerator accountNumberGenerator = new IncrementalAccountNumberGenerator();
        AccountRepository accountRepository = new ArrayAccountRepository();
        var bank = new BankService(accountNumberGenerator, accountRepository); //wstrzykiwanie zależności
        //--------------------------------------------------------------------------------------------
        var firstAccount = bank.createAccount(DEFAULT_CURRENCY);
        var secondAccount = bank.createAccount(DEFAULT_CURRENCY);

        var amount = Money.of(100, DEFAULT_CURRENCY);

        try {
            bank.deposit(firstAccount.getNumber(), amount);
            bank.transer(firstAccount.getNumber(), secondAccount.getNumber(), Money.of(10, DEFAULT_CURRENCY));
            bank.withdraw(secondAccount.getNumber(), Money.of(11, DEFAULT_CURRENCY));
        } catch (AccountNotFoundException accountNotFoundException) {
            System.out.println("Account not found");
        } catch (InsufficientFoundsException insufficientFoundsException) {
            System.out.println("Insufficient funds");
        }

        bank.printReport();

        Account account = new PremiumAccount("000000000000000001");
        System.out.println(amount);
        account.deposit(Money.of(100, DEFAULT_CURRENCY));

/*//        PremiumAccount premiumAccount = account;

        if (account instanceof PremiumAccount) {
//            PremiumAccount premiumAccount = (PremiumAccount) account;
        } else {
            System.out.println(amount);
        }

        if (account instanceof PremiumAccount) {
            PremiumAccount newPremiumAccount = (PremiumAccount) account;
            newPremiumAccount.getBalance();
        }*/
    }
}
