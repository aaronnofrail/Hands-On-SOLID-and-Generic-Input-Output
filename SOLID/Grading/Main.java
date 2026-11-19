package Grading;

public class Main {
    public static void main(String[] args) {
        GradeCalculator calculator = new GradeCalculator();
        GradeReportPrinter printer = new GradeReportPrinter();
        GradeRepository repository = new GradeRepository();
        double nilai = calculator.hitungNilaiAkhir(80, 85, 90);
        printer.cetakLaporan("Andi", nilai);
        repository.simpanDatabase("Andi", nilai);
    }
}
