package HandsOn_2;

public class Main {
    public static void main(String[] args) {
        for (AccountType type : AccountType.values()) {
            System.out.println(
                "Nama: " + type.name()
                    + " | Kode: " + type.getCode()
                    + " | Suku Bunga: " + type.getInterestRate() + "%"
            );
        }
    }
}
