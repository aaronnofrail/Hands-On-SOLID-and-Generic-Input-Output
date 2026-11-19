package SmartVehicle;

public class MobilListrik implements EnginePowered, Rechargeable {
    @Override
    public void startEngine() {
        System.out.println("Menyalakan sistem penggerak mobil listrik...");
    }

    @Override
    public void isiBaterai() {
        System.out.println("Mengisi baterai kendaraan listrik...");
    }
}
