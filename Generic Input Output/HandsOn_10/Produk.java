package HandsOn_10;

public class Produk<T, U> {
    private final T nama;
    private final U harga;
    private final Integer stok;

    public Produk(T nama, U harga, Integer stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    @Override
    public String toString() {
        return nama + "," + harga + "," + stok;
    }
}
