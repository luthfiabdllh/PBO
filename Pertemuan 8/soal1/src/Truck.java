import java.util.Date;

public class Truck extends Vehicle{
    private int cargoCapacity;

    public Truck(String merk, double hargaRental, int tahun, int cargoCapacity) {
        super(merk, hargaRental, tahun);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public void displayInfo() {
//        super.displayInfo();
        double diskon = 0.0;
        if(getTahun()<2010){
            diskon += getHargaRental() * 10 / 100;
        }
        if(getCargoCapacity()>2000) {
            diskon += getHargaRental() * 10 / 100;
        }
        System.out.println("Detail Mobil :");
        System.out.println("Merk : " + getMerk());
        System.out.println("Tahun : " + getTahun());
        System.out.println("harga Sewa : " + getHargaRental());
        System.out.println("Kapasitas Kargo : " + getCargoCapacity());
        System.out.println("Total Diskon : " + diskon);
        System.out.println("Harga Sewa Setelah Diskon : " + (getHargaRental() - diskon));
        System.out.println("-".repeat(50));
    }
}
