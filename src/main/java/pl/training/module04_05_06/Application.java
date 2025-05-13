package pl.training.module04_05_06;

import java.math.BigDecimal;

public class Application {
    public static void main(String[] args) {
        var pln = Currency.PLN;
        var eur = Currency.EUR;
        var usd = Currency.USD;
        System.out.printf("Current currency: %s\n", pln);
        System.out.printf("Current currency: %s\n", eur);
        System.out.printf("Current currency: %s\n", usd);

        new Money(new BigDecimal(1), pln);

    }
}
