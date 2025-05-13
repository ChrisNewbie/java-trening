package pl.training.module04_05_06;

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
        var money = Money.of(30, DEFAULT_CURRENCY);
        var othermoney = Money.of(20, DEFAULT_CURRENCY);
        System.out.println(money.add(othermoney));
        System.out.println(money.subtract(othermoney));
        System.out.println(money.isGreaterThanOrEqual(othermoney));
    }

}
