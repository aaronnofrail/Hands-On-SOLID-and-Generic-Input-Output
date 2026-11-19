package HandsOn_4;

public class Pair<T1, T2> {
    private final T1 first;
    private final T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    public void showTypes() {
        System.out.println(first.getClass().getName() + " & " + second.getClass().getName());
    }

    public Pair<T2, T1> swap() {
        return new Pair<>(second, first);
    }
}
