public class Manager extends Pegawai{
    public Manager(String nama, String departemen, char jenisKelamin) {
        super(nama, departemen, jenisKelamin);
    }

    @Override
    public int thr() {
        return super.thr() * 2;
    }
}
