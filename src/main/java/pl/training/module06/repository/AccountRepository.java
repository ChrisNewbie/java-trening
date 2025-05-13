package pl.training.module06.repository;

import pl.training.module06.model.Account;

import java.util.Optional;

public interface AccountRepository {

    Account save(Account account);

    //TODO: optional, page

    Account[] findAll();

    //    Account findByNumber(String number); // tego unikamy
    Optional<Account> findByNumber(String number); // zamiast tego co u góry


}
