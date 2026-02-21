package Pasd;

import java.util.Arrays;
import java.util.Scanner;

public class plat_hamas12 {
    static Scanner sc = new Scanner(System.in);
    static char KODE[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
    static char KOTA[][] = {
        {'B', 'A', 'N', 'T', 'E', 'N'},
        {'J', 'A', 'K', 'A', 'R', 'T', 'A'}, 
        {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
        {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
        {'B', 'O', 'G', 'O', 'R'},
        {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
        {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
        {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
        {'M', 'A', 'L', 'A', 'N', 'G'},
        {'T', 'E', 'G', 'A', 'L'}
    };

    static char input_huruf;
    static int index;
    static String str;

    public static void main(String[] args) {
        System.out.println("Masukkan kode kota(A-J)\ngunakan huruf besar: ");
        input_huruf = sc.next().charAt(0);
        index = Arrays.binarySearch(KODE, input_huruf);
        str = new String(KOTA[index]);
        System.out.println(str);
    }
}
