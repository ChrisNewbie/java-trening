package pl.training.module04_05.model;

public enum Currency {

    /*    @Override
    public String toString() {
        return switch (this) {
            case PLN -> "zł";
            case EUR -> "€";
            case USD -> "$";
        };
    }*/

    PLN {
        @Override
        public String toString() {
            return "zł";
        }
    }, USD {
        @Override
        public String toString() {
            return "$";
        }

    }, EUR {
        @Override
        public String toString() {
            return "€";
        }
    };
}
