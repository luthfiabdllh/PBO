public class Main{
    public static void main(String[] args) {
        Product barang1 = new Product("Tissue",12000,1);
        Product barang2 = new Product("Garam",5000,1);
        Product barang3 = new Product("Shampo",15000,1);
        Product barang4 = new Product("Kopi",2000,3);
        Keranjang keranjang1 = new Keranjang();

        keranjang1.addItem(barang1);
        keranjang1.addItem(barang2);
        keranjang1.addItem(barang3);
        keranjang1.addItem(barang4);
        keranjang1.printHasil();
    }

}