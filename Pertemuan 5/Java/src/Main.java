
public class Main {

    public static void main(String[] args) {
//        Scanner Sc = new Scanner(System.in);

        Barang beras = new Barang("Beras", 50000, 1);
        Barang sabun = new Barang("Sabun", 10000, 2);
        Barang sampo = new Barang("Sampo", 5000, 2);
        Barang gula = new Barang("Gula", 15000, 3);

        Keranjang keranjang1 = new Keranjang();
        keranjang1.tambahBarang(beras);
        keranjang1.tambahBarang(sabun);
        keranjang1.tambahBarang(sampo);
        keranjang1.tambahBarang(gula);

        System.out.println("\n====================\n");

        keranjang1.printHasil();
    }
}


