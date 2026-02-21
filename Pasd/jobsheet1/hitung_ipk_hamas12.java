package Pasd;
import java.util.Scanner;
public class hitung_ipk_hamas12 {

    static Scanner sc = new Scanner(System.in);

    static String nilai_huruf[] = {"A", "B", "C", "D", "E", "F"};
    static String[] pelajaran = {"Pancasila","Konsep Teknologi Informasi","Critical Thinking dan Problem Solving","Matematika Dasar","Bahasa Inggris","Dasar Pemrograman","Praktikum Dasar Pemrograman","Keselamatan dan Kesehatan Kerja"};
    static int[] bobot = {13, 11, 12, 14, 10, 13, 15, 12};

    static int[] nilai_pelajaran = new int[8]; 
    static int ip = 0;
    static float ipk;
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

    public static void cetak_tabel_nilai(int nilai[], String pelajaran[]) {
        System.out.printf(
        "%-40s %-12s %-13s %-15s%n", "Pelajaran", "Nilai Angka", "Nilai Huruf", "Bobot Pelajaran");
        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i < 8; i++) {
            if (nilai[i] > 80) {
                index = 0;
            } else if (nilai[i] > 73) {
                index = 1;
            } else if (nilai[i] > 65) {
                index = 2;
            } else if (nilai[i] > 60) {
                index = 3;
            } else if (nilai[i] > 50) {
                index = 4;
            } else if (nilai[i] > 39) {
                index = 5;
            } else {
                index = 6;
            }
            System.out.printf(
            "%-40s %-12d %-13s %-15d%n", pelajaran[i], nilai[i], nilai_huruf[index], bobot[index]);
            }
    }

    public static void main(String[] args) {
    for (int i = 0; i < 8; i++) {
    nilai_pelajaran[i] = input_nilai("Masukkan nilai " + pelajaran[i] + ": ");
    }
    cetak_tabel_nilai(nilai_pelajaran, pelajaran);

    for (int i = 0; i < 8; i++) {
        ip += (nilai_pelajaran[i] * bobot[i]) / 100;
    }
    System.out.println(ip);
    ipk = ip * 4 / 100;
    System.out.println("Nilai IPK anda adalah: " + ipk);
    }
}