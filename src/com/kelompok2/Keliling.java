package UTS;

import java.util.Scanner;

public class Keliling extends Luas {
    public static void kelilingSegitiga() {
        Scanner input = new Scanner(System.in);

        double[] keliling = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Sisi ke-" + (i + 1) + " : ");
            double sisi = input.nextDouble();
            keliling[i] = sisi;
        }
        System.out.println("Hasil");
        System.out.println("Keliling Segitiga Adalah : " + (keliling[0] * keliling[1] * keliling[2]));//k.getKeliling());
    }
}
