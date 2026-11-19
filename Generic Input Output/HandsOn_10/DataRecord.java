package HandsOn_10;

public class DataRecord<A, B, C> {
    private final A col1;
    private final B col2;
    private final C col3;

    public DataRecord(A col1, B col2, C col3) {
        this.col1 = col1;
        this.col2 = col2;
        this.col3 = col3;
    }

    @Override
    public String toString() {
        return col1 + "," + col2 + "," + col3;
    }
}
