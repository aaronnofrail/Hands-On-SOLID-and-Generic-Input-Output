package HandsOn_10;

public class Produk extends DataRecord<String, Double, Integer> {
    public Produk(String nama, Double harga, Integer stok) {
        super(nama, harga, stok);
    }
}
