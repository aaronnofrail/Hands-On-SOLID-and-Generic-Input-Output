package HandsOn_4;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(100, "Nilai Bagus");
        p1.showTypes();
        System.out.println("Sebelum swap: " + p1.getFirst() + ", " + p1.getSecond());
        Pair<String, Integer> swappedP1 = p1.swap();
        System.out.println("Sesudah swap: " + swappedP1.getFirst() + ", " + swappedP1.getSecond());

        Pair<Double, Boolean> p2 = new Pair<>(9.5, true);
        p2.showTypes();
        System.out.println("Sebelum swap: " + p2.getFirst() + ", " + p2.getSecond());
        Pair<Boolean, Double> swappedP2 = p2.swap();
        System.out.println("Sesudah swap: " + swappedP2.getFirst() + ", " + swappedP2.getSecond());
    }
}
