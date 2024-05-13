public class Salesman extends Pegawai{
    private int target;
    private int penjualan;

    public Salesman(String nama, String departemen, char jenisKelamin) {
        super(nama, departemen, jenisKelamin);
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    @Override
    public int thr() {
        if (penjualan >= target) {
            return gaji * 2;
        } else {
            return gaji;
        }
    }
}
