package HandsOn_8;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WriteUserInputWithTimestamp {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        try (
            Scanner sc = new Scanner(System.in);
            BufferedWriter bw = Files.newBufferedWriter(
                Paths.get("user_input.txt"),
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
            )
        ) {
            System.out.println("Masukkan teks (ketik 'exit' untuk selesai):");
            while (true) {
                System.out.print("Enter text: ");
                String text = sc.nextLine();
                if ("exit".equalsIgnoreCase(text.trim())) {
                    break;
                }
                String timestamp = LocalDateTime.now().format(formatter);
                bw.write("[" + timestamp + "] " + text);
                bw.newLine();
                bw.flush();
            }
            System.out.println("Saved!");
        } catch (IOException e) {
            throw new java.io.UncheckedIOException("Gagal menyimpan input pengguna", e);
        }
    }
}
