package Pasd;
import java.util.Scanner;

public class hitung_nilai_akhir_hamas12 {

    static Scanner sc = new Scanner(System.in);

    static float nilai_angka[] = {4f, 3.5f, 3f, 2.5f, 2f, 1f, 0f};
    static String nilai_huruf[] = {"A", "B", "C", "D", "E", "F"};
    static String kualifikasi[] = {"Sangat baik", "Lebih dai baik", "Baik", "Lebih dari cukup", "Cukup", "Kurang", "Gagal"};

    static int nilai_tugas;
    static int nilai_kuis;
    static int nilai_uts;
    static int nilai_uas;

    static int nilai_akhir;

    static int index;

    public static int input_nilai(String text) {
        int nilai_awal;
        System.out.println(text);

        nilai_awal = sc.nextInt();
        if ((nilai_awal >= 0) && (nilai_awal <= 100)) {
            return nilai_awal;
        } else {
            System.out.println("masukkan nilai yang valid (0 sampai 100)");
            return input_nilai(text);
        }
    }

    public static void main(String[] args) {
    System.out.println("Program menghitung nilai akhir\n" + "=".repeat(7));   

    nilai_tugas = input_nilai("Masukkan nilai tugas");
    nilai_kuis = input_nilai("Masukkan nilai kuis");
    nilai_uts = input_nilai("Masukkan nilai uts");
    nilai_uas = input_nilai("Masukkan nilai uas");

    nilai_akhir = (nilai_tugas * 2) + (nilai_kuis * 2) + (nilai_uts * 3) + (nilai_uas * 3);
    nilai_akhir /= 10;

    if (nilai_akhir > 80) {
        index = 0;
    } else if (nilai_akhir > 73) {
        index = 1;
    } else if (nilai_akhir > 65) {
        index = 2;
    } else if (nilai_akhir > 60) {
        index = 3;
    } else if (nilai_akhir > 50) {
        index = 4;
    } else if (nilai_akhir > 39) {
        index = 5;
    } else {
        index = 6;
    }

    System.out.println("=".repeat(7));
    System.out.println("Nilai akhir anda adalah: " + nilai_akhir);
    System.out.println("Nilai huruf anda adalah: " + nilai_huruf[index]);
    System.out.println("Nilai angka anda adalah: " + nilai_angka[index]);
    System.out.println(kualifikasi[index]);

    System.out.println("=".repeat(7));
    if (nilai_akhir > 50) {
        System.out.println("SELAMAT ANDA LULUS");
    } else {
        System.out.println("ANDA TIDAK LULUS");
    }

    System.out.println("=".repeat(7));
    }
}
