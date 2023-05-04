package UTS;

import java.util.Scanner;

public class Luas {
    public static void luasSegitiga() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah segitiga: ");
        int n = input.nextInt();
        double[] luas = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan alas segitiga ke-" + (i + 1) + ": ");
            double alas = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga ke-" + (i + 1) + ": ");
            double tinggi = input.nextDouble();
            luas[i] = 0.5 * alas * tinggi;
        }
        System.out.println("Hasil:");
        for (int i = 0; i < n; i++) {
            System.out.println("Luas segitiga ke-" + (i + 1) + ": " + luas[i]);
        }
        input.close();
    }
}
