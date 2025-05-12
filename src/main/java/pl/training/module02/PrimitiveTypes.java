package pl.training.module02;

public class PrimitiveTypes {

    public static void main(String[] args) {
        // nazwa_typu nazwa_zmiennej [=wartosc]
        boolean isValid = true;
        System.out.println("isValid: " + isValid);
        int age;
//        System.out.println("Age: " + age); //błąd kompilatora

        long id = 1; //int miesci się w long
//        int value = id; // long nie miesci się w int
        int myValue = (int) id; // jawna konwersja z potencjalnym rysykiem utraty informacji
        long newId = 1_000_000_000; // podkreślenia są ignorowane

        float result = 10.13F; // jawne wskazanie typu literału



    }
}
