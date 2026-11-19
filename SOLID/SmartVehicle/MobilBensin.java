package SmartVehicle;

public class MobilBensin implements EnginePowered, Refuelable {
    @Override
    public void startEngine() {
        System.out.println("Menyalakan mesin mobil bensin...");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Mengisi bahan bakar kendaraan...");
    }
}
