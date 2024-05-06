import java.util.Date;

enum CarType{
    CITY_CAR,
    PREMIUM_CAR,
    FAMILY_CAR
}
public class Car extends Vehicle{
    private CarType type;


    public Car(String merk, double hargaRental, int tahun, CarType type) {
        super(merk, hargaRental, tahun);
        this.type = type;
    }

    public CarType getType() {
        return type;
    }

    @Override
    public void displayInfo() {
//        super.displayInfo();
        double diskon = 0.0;
        if(getTahun()<2010){
            diskon += getHargaRental() * 10 / 100;
        }
        if(getType()==CarType.FAMILY_CAR) {
            diskon += getHargaRental() * 5 / 100;
        } if(getType()==CarType.PREMIUM_CAR) {
            diskon += getHargaRental() * 10 / 100;
        }
        System.out.println("Detail Mobil :");
        System.out.println("Merk : " + getMerk());
        System.out.println("Tahun : " + getTahun());
        System.out.println("harga Sewa : " + getHargaRental());
        System.out.println("Tipe Mobil : " + getType());
        System.out.println("Total Diskon : " + diskon);
        System.out.println("Harga Sewa Setelah Diskon : " + (getHargaRental() - diskon));
        System.out.println("-".repeat(50));
    }
}
