package pl.training.module02;

import java.util.Date;

public class ReferenceType {

    public static void main(String[] args) {
        String name = "John"; // alokacja pamięci może nie zostać pzreprowadzona jeśli tekst jest już w pamięci
        String secondName = "John";
        String lastName = new String("Smith"); //new zawsze wymusza alokację pamięci

        int age = 6;
        String text = "Ala ma " + age + " lat";
        System.out.println(text);

        int firstValue = 1;
        int secondValue = 2;
        System.out.println("Result: " + firstValue + secondValue);
        System.out.println("Result: " + (firstValue + secondValue));
        System.out.println(firstValue + secondValue + " is result");

        Account firstAccount = new Account(); //domyslny konstruktor, wygenerowany automatycznie
        firstAccount.number = "123456789";
        System.out.println("First account number: " + firstAccount.number);
        Account myAccount = firstAccount;
        System.out.println("My account number: " + myAccount.number);

        Account secondAccount = new Account();
        secondAccount.number = "1234567890";
        System.out.println("First account number: " + secondAccount.number);

        secondAccount.printBalance();
        secondAccount.deposit(1_000);
        secondAccount.printBalance();

        var referenceType = new ReferenceType(); // var wnioskowanie, wymyślanie typu

        int score = 5;
        int myScore = score; //utworzenie kopii zmiennej
        myScore = myScore + 1;
        System.out.println("Score: " + score);
        System.out.println("My Score: " + myScore);


        referenceType.passByValue(score);

        Account testAccount = new Account();
        referenceType.passByReference(testAccount);
        System.out.println("Test account balance: " + testAccount.balance);

//        {
//            int x = 1;
//            int y = x;
//            x = 2;
//            System.out.println("x: " + x + " y: " + y);
//        }

        referenceType.passBankClientByReference(new BankClient());

        var bankClient = new BankClient();
        bankClient.name = "John";
        bankClient.surname = "Smith";
        bankClient.email = "<EMAIL>";

        bankClient.printBankClientInfo();
    }

    public void passByValue(int value) { //przekazanie kopii zmiennej
        value = value + 1;
        System.out.println("Value: " + value);
    }

    public void passByReference(Account account) {
        account.deposit(100);
        System.out.println("Start account balance: " + account.balance);

        account.withdraw(100);
        System.out.println("Account balance after withdraw: " + account.balance);
    }

    public void passBankClientByReference(BankClient bankClient) {
        bankClient.name = "John";
        bankClient.surname = "Smith";
        bankClient.email = "<EMAIL>";

        bankClient.name = "Jane";
        bankClient.surname = "Doe";
        bankClient.email = "<EMAIL>";

        System.out.println("First bank client name: " + bankClient.name);
        System.out.println("First bank client surname: " + bankClient.surname);
        System.out.println("First bank client email: " + bankClient.email);

        Date date = new Date();
        bankClient.dateOfBirth = date;
        System.out.println("First bank client date of birth: " + bankClient.dateOfBirth);


    }



}