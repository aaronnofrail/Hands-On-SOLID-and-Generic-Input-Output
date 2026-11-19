package HandsOn_1;

public enum AccountType {
    SAVINGS("Rekening Tabungan"),
    CREDIT("Rekening Kredit"),
    DEPOSIT("Rekening Deposito");

    private final String description;

    AccountType(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name() + " (" + description + ")";
    }
}
