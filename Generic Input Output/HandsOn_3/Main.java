package HandsOn_3;

public class Main {
    public static void main(String[] args) {
        Cell<Integer> intCell = new Cell<>();
        intCell.setValue(42);
        System.out.println("Nilai: " + intCell.getValue());
        intCell.displayType();

        Cell<String> strCell = new Cell<>();
        strCell.setValue("Belajar Generics");
        System.out.println("Nilai: " + strCell.getValue());
        strCell.displayType();
    }
}
