package HandsOn_9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SerializeDemo {
    public static void serialize(List<Employee> list, String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(list);
            System.out.println("Serialized successfully.");
        }
    }

    public static List<Employee> deserialize(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Object value = ois.readObject();
            if (!(value instanceof List<?>)) {
                throw new IOException("Konten file bukan daftar karyawan");
            }

            List<Employee> employees = new ArrayList<>();
            for (Object item : (List<?>) value) {
                if (!(item instanceof Employee)) {
                    throw new IOException("Daftar berisi objek yang bukan Employee");
                }
                employees.add((Employee) item);
            }
            return employees;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path file = Paths.get("HandsOn_9", "emp.ser");
        Files.createDirectories(file.getParent());
        String filename = file.toString();
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("John", 30));
        list.add(new Employee("Ayu", 24));
        list.add(new Employee("Budi", 28));
        serialize(list, filename);

        List<Employee> restored = deserialize(filename);
        for (Employee emp : restored) {
            System.out.println("Deserialized: " + emp);
        }
    }
}
