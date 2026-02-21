package Pasd;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class jadwal_kuliah_hamas {
    static Scanner sc = new Scanner(System.in);
    static String[][] jadwal;
    static int n;

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        n = sc.nextInt();
        sc.nextLine(); 

        inputData();

        tampilkanSemua();

        System.out.print("\nCari jadwal berdasarkan HARI: ");
        String cariHari = sc.nextLine();
        tampilkanBerdasarkanHari(cariHari);

        System.out.print("\nCari lokasi ruang berdasarkan NAMA MATKUL: ");
        String cariMatkul = sc.nextLine();
        cariBerdasarkanMatkul(cariMatkul);
    }

    static void inputData() {
        jadwal = new String[n][4];
        for (int i = 0; i < n; i++) {
            System.out.println("\nData Jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari             : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam (HH.mm-HH.mm): ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    static void tampilkanSemua() {
        System.out.println("\n======================= DAFTAR JADWAL KULIAH =======================");
        System.out.printf("%-20s | %-15s | %-10s | %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("--------------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s | %-15s | %-10s | %-15s\n", 
                jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    static void tampilkanBerdasarkanHari(String hari) {
        System.out.println("\nJadwal pada hari " + hari + ":");
        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println("- " + jadwal[i][0] + " (" + jadwal[i][3] + ") di " + jadwal[i][1]);
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Tidak ada jadwal pada hari tersebut.");
    }

    static void cariBerdasarkanMatkul(String matkul) {
        Arrays.sort(jadwal, Comparator.comparing(a -> a[0].toLowerCase()));

        String[] listMatkul = new String[n];
        for (int i = 0; i < n; i++) {
            listMatkul[i] = jadwal[i][0].toLowerCase();
        }

        int index = Arrays.binarySearch(listMatkul, matkul.toLowerCase());

        if (index >= 0) {
            System.out.println("Hasil ditemukan:");
            System.out.println("Matkul: " + jadwal[index][0]);
            System.out.println("Ruang : " + jadwal[index][1]);
            System.out.println("Waktu : " + jadwal[index][2] + ", " + jadwal[index][3]);
        } else {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}