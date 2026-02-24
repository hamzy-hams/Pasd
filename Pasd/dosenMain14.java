package pasd2;

class Dosen14 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen14() {
    }

    public Dosen14(String id, String nama, boolean status, int tahun, String keahlian) {
        this.idDosen = id;
        this.nama = nama;
        this.statusAktif = status;
        this.tahunBergabung = tahun;
        this.bidangKeahlian = keahlian;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen       : " + idDosen);
        System.out.println("Nama           : " + nama);
        System.out.println("Status Aktif   : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println("Status " + nama + " telah diubah menjadi: " + (status ? "Aktif" : "Tidak Aktif"));
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
    }
}

public class dosenMain14 {
    public static void main(String[] args) {

        System.out.println("=== DATA DOSEN 1 ===");
        Dosen14 dosen1 = new Dosen14("D001", "Dr. Budi Santoso", true, 2015, "Data Science");
        dosen1.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2024) + " tahun");

        dosen1.ubahKeahlian("Artificial Intelligence");
        System.out.println("Update Keahlian: " + dosen1.bidangKeahlian);

        System.out.println("=== DATA DOSEN 2 ===");
        Dosen14 dosen2 = new Dosen14();
        dosen2.idDosen = "D002";
        dosen2.nama = "Siti Aminah, M.T.";
        dosen2.statusAktif = false;
        dosen2.tahunBergabung = 2020;
        dosen2.bidangKeahlian = "Sistem Informasi";

        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2024) + " tahun");
    }
}
