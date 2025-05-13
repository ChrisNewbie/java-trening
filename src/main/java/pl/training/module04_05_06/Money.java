package pl.training.module04_05_06;

import java.math.BigDecimal;

public record Money(BigDecimal value, Currency currency) {

    public Money {

        /*if (value.signum() < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }*/

/*        if (value.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }*/


        if (value.signum() == -1) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }

    public static Money of(double value, Currency currency) {
        return new Money(new BigDecimal(value), currency);
    }

/*    public Money add(Money money) {
        if (currency != money.currency) {
            throw new IllegalArgumentException("Money currencies must be the same");
        }
        return new Money(value.add(money.value), currency);
    }

    public Money subtract(Money money) {
        if (currency != money.currency) {
            throw new IllegalArgumentException("Money currencies must be the same");
        }
        return new Money(value.subtract(money.value), currency);
    }*/

    public Money add(Money money) {
        checkCurrencyCompatibility(money);
        return new Money(value.add(money.value), currency);
    }

    public Money subtract(Money money) {
        checkCurrencyCompatibility(money);
        return new Money(value.subtract(money.value), currency);
    }

    public boolean isGreaterThanOrEqual(Money money) {
        checkCurrencyCompatibility(money);
        return value.compareTo(money.value) >= 0;
    }

    private void checkCurrencyCompatibility(Money money) {
        if (currency != money.currency) {
            throw new IllegalArgumentException("Money currencies must be the same");
        }
    }
}

