public class Pegawai {
    private String name;
    private String department;
    private char jenisKelamin;
    protected int gaji;
    private String nip;
    private int cuti = 12;

    public Pegawai (String nama, String departemen, char jenisKelamin) {
        this.name = nama;
        this.department = departemen;
        this.jenisKelamin = jenisKelamin;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public int thr() {
        return gaji;
    }

    public void setCuti(int keterangan) {
        cuti += keterangan;
    }

    public void setCuti(String keterangan) {
        if (keterangan.equalsIgnoreCase("pernikahan")) {
            cuti += 2;
        } else if (keterangan.equalsIgnoreCase("persalinan") && jenisKelamin == 'L') {
            cuti += 3;
        } else if (keterangan.equalsIgnoreCase("persalinan") && jenisKelamin == 'P') {
            cuti += 90;
        }
    }


    public void setNip(int nip) {
        if(this instanceof Manager) {
            this.nip = "K" + String.format("%04d",nip);
        } else if (this instanceof Salesman) {
            this.nip = "M" + String.format("%04", nip);
        } else {
            this.nip = "P" + String.format("%04d", nip);
        }
    }

    public void cekJabatan(String nip) {
        if (nip.startsWith("S")) {
            System.out.println("Salesman");
        } else if (nip.startsWith("M")) {
            System.out.println("Manager");
        } else {
            System.out.println("Pegawai");
        }
    }

    public void displayInfo() {
        System.out.print("Jabatan : "); cekJabatan(nip);
        System.out.println("Nama : "+name);
        System.out.println("Departemen : "+department);
        System.out.println("NIP : "+nip);
        System.out.println("Gaji : "+gaji);
        System.out.println("THR : "+thr());
        System.out.println("Cuti : "+cuti);
        System.out.println("-".repeat(30));
    }

}
