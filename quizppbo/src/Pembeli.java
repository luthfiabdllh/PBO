public class Pembeli {
    private String nama;
    private int jumlahBarang;
    private Toko.tipeBarang barangDibeli;

    public Pembeli(String nama, Toko.tipeBarang barangDibeli, int jumlahBarang) {
        this.nama = nama;
        this.jumlahBarang = jumlahBarang;
        this.barangDibeli = barangDibeli;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public Toko.tipeBarang getBarangDibeli() {
        return barangDibeli;
    }
}
