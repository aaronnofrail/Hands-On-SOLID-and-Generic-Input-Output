package HandsOn_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadEmployeesNIO {
    public static void main(String[] args) {
        Path path = Paths.get("HandsOn_6", "employees.txt");
        Path outputPath = Paths.get("HandsOn_6", "copy_employees.txt");

        if (Files.notExists(path)) {
            System.out.println("File tidak ditemukan: " + path.toAbsolutePath());
            return;
        }

        List<String> employees = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                employees.add(line);
                System.out.println(line);
            }
            Files.write(outputPath, employees, StandardCharsets.UTF_8);
            System.out.println("Berhasil disalin ke: " + outputPath);
        } catch (IOException e) {
            throw new java.io.UncheckedIOException("Gagal membaca atau menyalin file karyawan", e);
        }
    }
}
