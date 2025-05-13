package pl.training.module04_05_06;

public enum Currency {
    PLN, USD, EUR;

    @Override
    public String toString() {
        return switch (this) {
            case PLN -> "zł";
            case EUR -> "€";
            case USD -> "$";
        };
    }
}
