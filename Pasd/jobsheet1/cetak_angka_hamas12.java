package Pasd;
import java.util.Scanner;

public class cetak_angka_hamas12 {
    
    static String nim;
    static int length;
    static int n;

    static Scanner sc = new Scanner(System.in);

    public static void cetak_angka(int n) {
        if (n < 10) {
            n += 10;
        }
        for (int i = 1; i <= n; i++) {
            if ((i == 10) || (i == 15) ) {
                continue;
            } else if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        System.out.println("Masukkan nim:");
        nim = sc.nextLine();
        length = nim.length();

        n = Integer.parseInt(nim.substring(length - 2, length));

        cetak_angka(n);
    }    
}
