package com.kelompok2;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void luasSegitiga() {
        System.out.print("Masukkan jumlah segitiga: ");
        int n = input.nextInt();

        Luas[] segitigas = new Luas[n];

        for (int i = 0; i < n; i++) {
            Luas segitiga = new Luas();

            System.out.print("Masukkan alas segitiga ke-" + (i + 1) + ": ");
            double alas = input.nextDouble();
            segitiga.setAlas(alas);

            System.out.print("Masukkan tinggi segitiga ke-" + (i + 1) + ": ");
            double tinggi = input.nextDouble();
            segitiga.setTinggi(tinggi);

            segitigas[i] = segitiga;
        }

        System.out.println("Hasil:");
        for (int i = 0; i < n; i++) {
            System.out.println("Luas segitiga ke-" + (i + 1) + ": " + segitigas[i].getLuas());
        }
    }

    public static void kelilingSegitiga(){
        Keliling keliling = new Keliling();

        System.out.println("Masukkan Sisi 1 : ");
        int sisi1 = input.nextInt();
        keliling.setSisi1(sisi1);

        System.out.println("Masukkan Sisi 2 : ");
        int sisi2 = input.nextInt();
        keliling.setSisi2(sisi2);

        System.out.println("Masukkan Sisi 3 : ");
        int sisi3 = input.nextInt();
        keliling.setSisi3(sisi3);

        System.out.println("Hasil");
        System.out.println("Keliling Segitiga Adalah : " + keliling.getKeliling());
    }

    public static void login(){
        String username = "admin";
        String password = "admin";
        boolean ceklogin = false;

        while (!ceklogin){
            System.out.print("Masukan Username: ");
            String inputusername = input.nextLine();
            System.out.print("Masukan Password: ");
            String inputpassword = input.nextLine();

            if (username.equals(inputusername) && password.equals(inputpassword)){
                System.out.println("Login Berhasil! \n");
                ceklogin = true;
            } else {
                System.out.println("Login Gagal! Silahkan Coba Kembali!");
            }
        }

    }


    public static void main(String[] args) {

        login();
        char kmbl = 'y';
        do {
            System.out.println("MENGHITUNG LUAS DAN KELILING SEGITIGA");
            System.out.println("*************************************");
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
