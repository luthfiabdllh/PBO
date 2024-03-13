class Product{
    String nama;
    int harga;
    int jumlah;

    Product (String nama, int harga, int jumlah){
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    int totalHarga(){
        return harga * jumlah;
    }
}