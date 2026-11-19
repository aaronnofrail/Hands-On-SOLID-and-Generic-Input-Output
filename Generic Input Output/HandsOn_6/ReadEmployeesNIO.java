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
        Path path = findEmployeesFile();

        if (path == null) {
            System.out.println(
                "File employees.txt tidak ditemukan. Folder kerja saat ini: "
                    + Paths.get("").toAbsolutePath()
            );
            return;
        }

        Path outputPath = path.resolveSibling("copy_employees.txt");
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

    private static Path findEmployeesFile() {
        Path current = Paths.get("").toAbsolutePath();
        while (current != null) {
            Path[] candidates = {
                current.resolve(Paths.get("HandsOn_6", "employees.txt")),
                current.resolve(Paths.get("Generic Input Output", "HandsOn_6", "employees.txt")),
                current.resolve(Paths.get("TugasHandsOn", "Generic Input Output", "HandsOn_6", "employees.txt"))
            };
            for (Path candidate : candidates) {
                if (Files.isRegularFile(candidate)) {
                    return candidate;
                }
            }
            current = current.getParent();
        }
        return null;
    }
}
