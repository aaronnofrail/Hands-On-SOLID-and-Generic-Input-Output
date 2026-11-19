package HandsOn_10;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ProdukWriterNew {
    public static <T> void writeData(List<T> items, Path filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        for (T item : items) {
            lines.add(item.toString());
        }
        Files.write(filePath, lines, StandardCharsets.UTF_8);
    }

    public static List<String> readData(Path filePath) throws IOException {
        return Files.readAllLines(filePath, StandardCharsets.UTF_8);
    }

    public static void main(String[] args) {
        List<Produk<String, Double>> produkList = new ArrayList<>();
        produkList.add(new Produk<>("Laptop", 15000000.0, 10));
        produkList.add(new Produk<>("Mouse", 150000.0, 25));
        produkList.add(new Produk<>("Keyboard", 350000.0, 15));

        List<DataRecord<String, String, Double>> transaksiList = new ArrayList<>();
        transaksiList.add(new DataRecord<>("TRX001", "Pelanggan 1", 150000.0));
        transaksiList.add(new DataRecord<>("TRX002", "Pelanggan 2", 350000.0));

        Path handsOnFolder = findHandsOnFolder();
        if (handsOnFolder == null) {
            throw new IllegalStateException("Folder HandsOn_10 tidak ditemukan dari " + Paths.get("").toAbsolutePath());
        }
        Path produkFile = handsOnFolder.resolve("produk_output.txt");
        Path transaksiFile = handsOnFolder.resolve("transaksi_output.txt");
        try {
            Files.createDirectories(produkFile.getParent());
            writeData(produkList, produkFile);
            System.out.println("=== Isi produk_output.txt ===");
            for (String line : readData(produkFile)) {
                System.out.println(line);
            }

            writeData(transaksiList, transaksiFile);
            System.out.println("\n=== Isi transaksi_output.txt ===");
            for (String line : readData(transaksiFile)) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new java.io.UncheckedIOException("Gagal memproses file", e);
        }
    }

    private static Path findHandsOnFolder() {
        Path current = Paths.get("").toAbsolutePath();
        while (current != null) {
            Path[] candidates = {
                current.resolve(Paths.get("Generic Input Output", "HandsOn_10")),
                current.resolve(Paths.get("TugasHandsOn", "Generic Input Output", "HandsOn_10")),
                current.resolve("HandsOn_10")
            };
            for (Path candidate : candidates) {
                if (Files.isDirectory(candidate)) {
                    return candidate;
                }
            }
            current = current.getParent();
        }
        return null;
    }
}
