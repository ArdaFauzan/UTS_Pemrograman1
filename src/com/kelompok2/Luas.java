package UTS;

import java.util.Scanner;

public class Luas extends Kerangka{
    public static void luasSegitiga() {
        Scanner inputluas = new Scanner(System.in);

        System.out.print("\nMasukkan Jumlah Segitiga: ");
        int n = inputluas.nextInt();
        Kerangka.luas = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan Alas Segitiga ke-" + (i + 1) + ": ");
            double alas = inputluas.nextDouble();
            System.out.print("Masukkan Tinggi Segitiga ke-" + (i + 1) + ": ");
            double tinggi = inputluas.nextDouble();
            System.out.println();
            Kerangka.luas[i] = 0.5 * alas * tinggi;
        }
        System.out.println("Hasil:");
        for (int i = 0; i < n; i++) {
            System.out.println("Luas segitiga ke-" + (i + 1) + ": " + luas[i]);
        }
    }
}

