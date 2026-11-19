package SmartVehicle;

public class Main {
    public static void main(String[] args) {
        MobilListrik mobilListrik = new MobilListrik();
        mobilListrik.startEngine();
        mobilListrik.isiBaterai();

        ChargingStation station = new ChargingStation();
        station.prosesPengisian(mobilListrik);

        Sepeda sepeda = new Sepeda();
        sepeda.kayuh();
    }
}
