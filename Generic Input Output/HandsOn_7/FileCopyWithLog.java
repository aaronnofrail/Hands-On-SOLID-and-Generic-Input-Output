package HandsOn_7;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.List;

public class FileCopyWithLog {
    public static void main(String[] args) {
        Path source = Paths.get("report.txt");
        Path backup = Paths.get("backup/report.txt");
        Path logFile = Paths.get("log.txt");

        try {
            if (!Files.exists(source)) {
                appendLog(logFile, LocalDateTime.now() + " - GAGAL: File sumber tidak ada (" + source + ")");
                System.out.println("File sumber tidak ditemukan: " + source.toAbsolutePath());
                return;
            }

            if (backup.getParent() != null && Files.notExists(backup.getParent())) {
                Files.createDirectories(backup.getParent());
            }
            Files.copy(source, backup, StandardCopyOption.REPLACE_EXISTING);
            appendLog(logFile, LocalDateTime.now() + " - SUKSES: Menyalin " + source + " ke " + backup);
            System.out.println("Backup created successfully!");
        } catch (IOException e) {
            try {
                appendLog(logFile, LocalDateTime.now() + " - ERROR: " + e.getMessage());
            } catch (IOException logError) {
                e.addSuppressed(logError);
            }
            throw new java.io.UncheckedIOException("Gagal menyalin file", e);
        }
    }

    private static void appendLog(Path logFile, String message) throws IOException {
        Files.write(
            logFile,
            List.of(message),
            StandardCharsets.UTF_8,
            StandardOpenOption.CREATE,
            StandardOpenOption.APPEND
        );
    }
}
