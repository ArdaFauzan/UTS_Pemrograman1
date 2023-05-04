package UTS;

import java.util.Scanner;

import static UTS.Keliling.kelilingSegitiga;
import static UTS.Luas.luasSegitiga;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Login.login();
        String kmbl = "y";
        do {
            System.out.println("MENGHITUNG LUAS DAN KELILING SEGITIGA");
            System.out.println("*******************************");
            System.out.println("1. Mencari Luas Segitiga");
            System.out.println("2. Mencari Keliling Segitiga");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            String pilih = input.nextLine();

            switch (pilih) {
                case "1":
                    luasSegitiga();
                    break;
                case "2":
                    kelilingSegitiga();
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Maaf Pilihan Anda Tidak Ada");
                    break;
            }
            if (pilih.equals("3")) {
                break;
            }
            System.out.println();
            System.out.print("Kembali [y/n] : ");
            kmbl = input.nextLine();
            System.out.println();
        } while (kmbl.equals("y"));

        System.out.println("TERIMA KASIH....");
    }
}
