import java.util.ArrayList;

public class Toko {
    private ArrayList<Pembeli> antrian;
    private Gudang gudangBarang;
    enum tipeBarang {
        MEJA, KURSI, LEMARI
    }

    public Toko() {
        antrian = new ArrayList<>();
        gudangBarang = new Gudang();
    }

    public Gudang getGudangBarang() {
        return gudangBarang;
    }

    public void tambahAntrian (Pembeli nama) {
        antrian.add(nama);
        System.out.println("Antrian berhasil ditambahkan");
    }

    public void selesaikanAntrian () {
        antrian.remove(antrian.size() - 1);
        System.out.println("Antrian terdepan berhasil diselesaikan");
    }

    public void cekIsiAntrian(){
        System.out.println(" LiST ANTRIAN : ");
        for (int i = 0; i < antrian.size(); i++) {
            System.out.println("antrian ke " +  (i + 1) +  ", nama : " + antrian.get(i).getNama()
                    + ", barang yang di beli " + antrian.get(i).getBarangDibeli()
                    + ", jumlah barang yang di beli : " + antrian.get(i).getJumlahBarang());
        }
    }

    public boolean barangDibeliTersedia(tipeBarang barang){
        if (gudangBarang.getIsiGudang().get(barang) != 0){
            return true;
        }
        return false;
    }
}
