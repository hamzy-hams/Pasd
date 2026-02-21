package Pasd;

public class toko_bunga_hamas12 {
    static int bunga[][] = {
        {10, 5, 15, 7},
        {6, 11, 9, 12}, 
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    static int harga_bunga[] = {75000, 50000, 60000, 10000};
    static int pendapatan;
    public static void main(String[] args) {
        for (int i = 0; i < bunga.length; i++) {
            pendapatan = 0;
            for (int j = 0; j < bunga[0].length; j++) {
                pendapatan += bunga[i][j] * harga_bunga[j];
            }
            
            if (pendapatan > 1500000) {
                System.out.println("Pendapatan cabang " + i + " sangat bagus");
            } else {
                System.out.println("Pendapatan cabang " + i + " perlu evaluasi");
            }
        }
    }
}
