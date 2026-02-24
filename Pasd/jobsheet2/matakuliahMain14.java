package pasd2;

class matakuliah {
    public String kodeMK;
    public String nama;
    public int sks;
    public int jam;

    public matakuliah (String mk, String nm, int sk, int ja) {
        kodeMK = mk;
        nama = nm;
        sks = sk;
        jam = ja;
    }

    public void tampilkan_informasi() {
        System.out.println("kode mata kuliah: " + kodeMK);
        System.out.println("nama: " + nama);
        System.out.println("banyak sks: " + sks);
        System.out.println("durasi: " + jam);
    }

    public void ubah_sks(int sk) {
        sks = sk;
    }

    public void kurangi_jam(int ja) {
        if (ja > jam) {
            jam -= ja;
        } else {
            System.out.println("durasi invalid, masukkan durasi dibawah total jam");
        }
    }

    public void tambah_jam(int ja) {
        jam += ja;
    }
}

public class matakuliahMain14 {
    public static void main(String[] args) {
        matakuliah pasd = new matakuliah("12345", "pasd", 012, 40);
        pasd.tampilkan_informasi();
    }
}
