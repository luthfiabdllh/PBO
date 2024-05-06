import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Vehicle {
    private String merk;
    private double hargaRental;
    private Date tahun;

    public int getTahun() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(tahun);
        return calendar.get(Calendar.YEAR);
    }

    public double getHargaRental() {
        return hargaRental;
    }

    public String getMerk() {
        return merk;
    }

    public Vehicle(String merk, double hargaRental, int tahun) {
        this.merk = merk;
        this.hargaRental = hargaRental;
        Calendar calendar = Calendar.getInstance();
        calendar.set(tahun, Calendar.JANUARY, 1);
        this.tahun = calendar.getTime();
    }

    public void displayInfo() {
        double diskon = 0.0;
        if(getTahun()<2010){
            diskon = getHargaRental() * 10 / 100;
        }
        System.out.println("Detail Mobil :");
        System.out.println("Merk : " + getMerk());
        System.out.println("Tahun : " + getTahun());
        System.out.println("harga Sewa : " + getHargaRental());
        System.out.println("Total Diskon : " + diskon);
        System.out.println("Harga Sewa Setelah Diskon : " + (getHargaRental() - diskon));
        System.out.println("-".repeat(50));
    }
}
