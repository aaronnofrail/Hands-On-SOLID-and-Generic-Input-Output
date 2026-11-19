package HandsOn_3;

public class Cell<T> {
    private T data;

    public void setValue(T data) {
        this.data = data;
    }

    public T getValue() {
        return data;
    }

    public void displayType() {
        System.out.println("Tipe data: " + (data != null ? data.getClass().getName() : "null"));
    }
}
