import java.util.ArrayList;

class Keranjang {
    ArrayList<Product> daftarBarang;
    int totalBarang;
    int jumlahTotal;
    Keranjang(){
        daftarBarang = new ArrayList<>();
        totalBarang = 0;
    }
    public void addItem(Product product) {
        if (daftarBarang.size() < 5 ) {
            daftarBarang.add(product);
            totalBarang += product.jumlah;
            jumlahTotal += product.totalHarga();
            System.out.println("Berhasil memasukan ke keranjang");
        } else {
            System.out.println("Wes too, keranjange wes mbludag!!");
        }
    }

    public void printHasil(){
        System.out.printf("Jumlah barang di keranjang saat ini : %d\n",totalBarang);
        System.out.println("Barang pada keranjang :");
        for(Product e:daftarBarang){
            System.out.printf("# %s, jumlah : %d\n",e.nama,e.jumlah);
        }
        System.out.printf("Total harga yang dibayar : %d",jumlahTotal);
    }

}
