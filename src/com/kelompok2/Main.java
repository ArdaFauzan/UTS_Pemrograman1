package UTS;

import java.util.Scanner;

import static UTS.Keliling.kelilingSegitiga;
import static UTS.Luas.luasSegitiga;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char kmbl = 'y';
        do {
            System.out.println("MENGHITUNG LUAS DAN KELILING SEGITIGA");
            System.out.println("*******************************");
            System.out.println("1. Mencari Luas Segitiga");
            System.out.println("2. Mencari Keliling Segitiga");
            System.out.println("3. Keluar");
            System.out.println("Masukkan Pilihan Anda : ");
            int pilih = input.nextInt();

            switch (pilih){
                case 1 :
                    luasSegitiga();
                    break;
                case 2 :
                    kelilingSegitiga();
                    break;
                case 3 :
                    break;
                default :
                    System.out.println("Maaf Pilihan Anda Tidak Ada");
                    break;
            }
            if (pilih == 3){
                break;
            }
            System.out.println("Kembali [y/n] : ");
            kmbl = input.next().charAt(0);
        }while (kmbl == 'y');

        System.out.println("TERIMA KASIH....");
    }
}
