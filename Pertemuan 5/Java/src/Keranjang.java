import java.util.ArrayList;

public class Keranjang {
    int jmlBarang = 0;
    ArrayList<Barang> listBarang = new ArrayList<>();
    void tambahBarang(Barang barang){
        if(jmlBarang+ barang.getJumlahBarang() <= 5){
            listBarang.add(barang);
            jmlBarang +=barang.getJumlahBarang();
            System.out.println("Berhasil memasukan ke keranjang");
        }else{
            System.out.println("Wes too, Keranjange wes mbludhag!!");
        }
    }
    int totalHarga(){
        int harga = 0;
        for ( Barang barang: listBarang
             ) {
         harga += barang.getHargaBarang() * barang.getJumlahBarang();
        }
        return harga;
    }
    void printHasil() {
        System.out.println( "Jumlah Barang Di Keranjang Saat Ini : " + jmlBarang);
        System.out.println( "Barang Pada Keranjang: ");
        for (Barang barang : listBarang) {
            System.out.println("# " + barang.getNamaBarang() + ", jumlah : " + barang.getJumlahBarang());
        }
        System.out.println("Total Harga Yang Harus di Bayar : " + totalHarga());
    }
}



