package UTS;

import java.util.Scanner;

public class Login {
    public static void login(){
        Scanner inputlogin = new Scanner(System.in);
        String username = "admin";
        String password = "admin";
        boolean ceklogin = false;

        while (!ceklogin){
            System.out.print("Masukan Username: ");
            String inputusername = inputlogin.nextLine();
            System.out.print("Masukan Password: ");
            String inputpassword = inputlogin.nextLine();

            if (username.equals(inputusername) && password.equals(inputpassword)){
                System.out.println("Login Berhasil! \n");
                ceklogin = true;
            } else {
                System.out.println("Login Gagal! Silahkan Coba Kembali!");
            }
        }
    }
}
