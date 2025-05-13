package pl.training.module04_05_06;

public interface AccountRepository {

    Account save(Account account);

    //TODO: optional, page

    Account[] findAll();

    Account findByNumber(String number);

}
