# Hands-On SOLID Programming & Generic Input Output

Gunakan Java 11 atau lebih baru. Package memisahkan kelas-kelas yang memiliki
nama sama di latihan berbeda. Buka folder `TugasHandsOn` sebagai workspace
Java di VS Code agar pengaturan source root di `.vscode/settings.json` dipakai.

Kompilasi dan jalankan dari source root masing-masing. Contoh:

| Folder | Kelas utama |
| --- | --- |
| Source root | Perintah (jalankan dari folder source root) |
| --- | --- |
| `SOLID` | `javac -d . Notification/*.java && java Notification.Main` |
| `SOLID` | `javac -d . Grading/*.java && java Grading.Main` |
| `SOLID` | `javac -d . SmartVehicle/*.java && java SmartVehicle.Main` |
| `Generic Input Output` | `javac -d . HandsOn_1/*.java && java HandsOn_1.Main` |
| `Generic Input Output` | `javac -d . HandsOn_2/*.java && java HandsOn_2.Main` |
| `Generic Input Output` | `javac -d . HandsOn_3/*.java && java HandsOn_3.Main` |
| `Generic Input Output` | `javac -d . HandsOn_4/*.java && java HandsOn_4.Main` |
| `Generic Input Output` | `javac -d . HandsOn_5/*.java && java HandsOn_5.CompareUtil` |
| `Generic Input Output` | `javac -d . HandsOn_6/*.java && java HandsOn_6.ReadEmployeesNIO` |
| `Generic Input Output` | `javac -d . HandsOn_7/*.java && java HandsOn_7.FileCopyWithLog` |
| `Generic Input Output` | `javac -d . HandsOn_8/*.java && java HandsOn_8.WriteUserInputWithTimestamp` |
| `Generic Input Output` | `javac -d . HandsOn_9/*.java && java HandsOn_9.SerializeDemo` |
| `Generic Input Output` | `javac -d . HandsOn_10/*.java && java HandsOn_10.ProdukWriterNew` |

Latihan 6 membaca `HandsOn_6/employees.txt` dan membuat
`HandsOn_6/copy_employees.txt`. Latihan 7 menyalin `report.txt` ke
`backup/report.txt` jika file sumber tersedia, serta mencatat hasilnya di
`log.txt`. Latihan 8 menerima masukan sampai `exit`. Latihan 9 menulis dan
membaca kembali `emp.ser`. Latihan 10 menghasilkan file produk dan transaksi,
lalu menampilkan kembali isinya.

Pada `HandsOn_4`, `Pair.swap()` mengembalikan pasangan baru bertipe
`Pair<T2, T1>`. Ini mempertahankan keamanan tipe saat elemen memiliki tipe
berbeda, tanpa cast yang tidak aman.
