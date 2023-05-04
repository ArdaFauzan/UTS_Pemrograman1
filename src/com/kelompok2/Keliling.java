package UTS;

import java.util.Scanner;

public class Keliling extends Kerangka {
    public static void kelilingSegitiga() {
        Scanner inputkeliling = new Scanner(System.in);

        Kerangka.keliling = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("\nMasukkan Sisi ke-" + (i + 1) + ": ");
            double sisi = inputkeliling.nextDouble();
            Kerangka.keliling[i] = sisi;
        }
        System.out.println();
        System.out.println("Hasil: ");
        System.out.println("Keliling Segitiga Adalah: " + (keliling[0] * keliling[1] * keliling[2]));
    }
}
