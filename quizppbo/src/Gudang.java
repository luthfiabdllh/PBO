import java.util.HashMap;

public class Gudang {
    enum bahan {
        KAYU, BAUT, CAT
    }

    private HashMap<Toko.tipeBarang, Integer> isiGudang;
    private HashMap<bahan, Integer> stokBahan;

    public Gudang() {
        stokBahan = new HashMap<bahan, Integer>();
        for (bahan bahan : bahan.values()) {
            stokBahan.put(bahan, 0);
        }

        isiGudang = new HashMap<Toko.tipeBarang, Integer>();
        for (Toko.tipeBarang tipeBarang : Toko.tipeBarang.values()) {
            isiGudang.put(tipeBarang, 0);
        }
    }

    public HashMap<bahan, Integer> getStokBahan() {
        return stokBahan;
    }

    public HashMap<Toko.tipeBarang, Integer> getIsiGudang() {
        return isiGudang;
    }

    public void cekStokBahan() {
        System.out.println(" STOK BAHAN :");
        for (bahan bahan : stokBahan.keySet()) {
            System.out.println("jumlah : " + bahan + ", saat ini adalah : " + stokBahan.get(bahan));
        }
    }

    public void cekIsiGudang() {
        System.out.println(" STOK BARANG :");
        for (Toko.tipeBarang barang : isiGudang.keySet()) {
            System.out.println("jumlah : " + barang + ", saat ini adalah : " + isiGudang.get(barang));
        }
    }

    public void tambahBahan(bahan bahan, int jumlah) {
        int jumlahSaatIni = stokBahan.get(bahan);
        stokBahan.put(bahan, jumlahSaatIni + jumlah);
    }

    public void kurangiBahan(bahan bahan, int jumlah) {
        int jumlahSaatIni = stokBahan.get(bahan);
        stokBahan.put(bahan, jumlahSaatIni - jumlah);
    }

    public void buatBarang(Toko.tipeBarang barang, int jumlah) {
        if (bahanPembuatanMencukupi(Toko.tipeBarang.MEJA, jumlah)) {
            kurangiBahan(bahan.KAYU, 3 * jumlah);
            kurangiBahan(bahan.BAUT, 20 * jumlah);
            kurangiBahan(bahan.CAT, 2 * jumlah);
            masukkanBarangKeGudang(Toko.tipeBarang.MEJA, jumlah);
            System.out.println(jumlah + " " + barang + " berhasil ditambahkan ke gudang");
        } else if (bahanPembuatanMencukupi(Toko.tipeBarang.KURSI, jumlah)) {
            kurangiBahan(bahan.KAYU, 2 * jumlah);
            kurangiBahan(bahan.BAUT, 10 * jumlah);
            kurangiBahan(bahan.CAT, 1 * jumlah);
            masukkanBarangKeGudang(Toko.tipeBarang.KURSI, jumlah);
            System.out.println(jumlah + " " + barang + " berhasil ditambahkan ke gudang");
        } else if (bahanPembuatanMencukupi(Toko.tipeBarang.LEMARI, jumlah)) {
            kurangiBahan(bahan.KAYU, 5 * jumlah);
            kurangiBahan(bahan.BAUT, 30 * jumlah);
            kurangiBahan(bahan.CAT, 3 * jumlah);
            masukkanBarangKeGudang(Toko.tipeBarang.LEMARI, jumlah);
            System.out.println(jumlah + " " + barang + " berhasil ditambahkan ke gudang");
        } else {
            System.out.println("Bahan tidak cukup");
        }
    }

    public void masukkanBarangKeGudang(Toko.tipeBarang barang, int jumlah) {
        int jumlahSaatIni = isiGudang.get(barang);
        isiGudang.put(barang, jumlahSaatIni + jumlah);
    }

    public void keluarkanBarangDariGudang(Toko.tipeBarang barang, int jumlah) {
        int jumlahSaatIni = isiGudang.get(barang);
        isiGudang.put(barang, jumlahSaatIni - jumlah);
    }

    public boolean bahanPembuatanMencukupi(Toko.tipeBarang barang, int jumlah) {
        if (barang == Toko.tipeBarang.MEJA && stokBahan.get(bahan.KAYU) >= 3 * jumlah && stokBahan.get(bahan.BAUT) >= 20 * jumlah && stokBahan.get(bahan.CAT) >= 2 * jumlah) {
            return true;
        } else if (barang == Toko.tipeBarang.KURSI && stokBahan.get(bahan.KAYU) >= 2 * jumlah && stokBahan.get(bahan.BAUT) >= 10 * jumlah && stokBahan.get(bahan.CAT) >= 1 * jumlah) {
            return true;
        } else if (barang == Toko.tipeBarang.LEMARI && stokBahan.get(bahan.KAYU) >= 5 * jumlah && stokBahan.get(bahan.BAUT) >= 30 * jumlah && stokBahan.get(bahan.CAT) >= 3 * jumlah) {
            return true;
        }
        return false;
    }
}
