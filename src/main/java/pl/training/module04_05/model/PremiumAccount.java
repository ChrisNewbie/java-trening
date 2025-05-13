package pl.training.module04_05.model;

public class PremiumAccount extends Account {

    private static final Money ON_START_BONUS = Money.of(100, Currency.PLN);

    public PremiumAccount(String number) {
        super(number, ON_START_BONUS);
    }


}
