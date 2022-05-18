/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest6;

/**
 *
 * @author USER
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    static InputStreamReader prepare = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(prepare);
    static int pilihan;

    public static void main(String[] args) throws IOException {
        ArrayList<Penyewa> dataPenyewa = new ArrayList<>();
        ArrayList<Petugas> dataPetugas = new ArrayList<>();
        dataPetugas.add(new Petugas("Petugas", "1234", "Petugas1", "Petugas1", "Petugas1"));
        dataPenyewa.add(new Penyewa("sholeha", "1111", "sholeha", "Perempuan", "Balikapapan", "1234"));
        Admin adm = new Admin("admin", "admin", "Kento", "Laki - Laki", "Jl. Perjuangan", dataPetugas, dataPenyewa);
        while (true) {
            System.out.println("======================MENU====================");
            System.out.println("|                  1.LOGIN                   |");
            System.out.println("|                  2.LOGOUT                  |");
            System.out.println("==============================================");
            System.out.print("Masukkan Pilihan : ");
            pilihan = Integer.parseInt(input.readLine());
            if (pilihan == 1) {
                System.out.print("Masukan username : ");
                String username = input.readLine();
                System.out.print("Masukan password : ");
                String password = input.readLine();
                if (username.equals(adm.getUsername()) && password.equals(adm.getPassword())) {
                    adm.menu();
                    continue;
                }
                for (Petugas petugas : dataPetugas) {
                    if (username.equals(petugas.getUsername()) && password.equals(petugas.getPassword())) {
                        petugas.menu();
                        continue;
                    }
                }
                for (Penyewa penyewa : dataPenyewa) {
                    if (username.equals(penyewa.getUsername()) && password.equals(penyewa.getPassword())) {
                        penyewa.menu();
                        continue;
                    }
                }
                System.out.println("Username atau password salah!!! -_-");
            } else {
                System.out.println("TERIMAKASIH SUDAH MAMPIR ^.^");
                break;
            }
        }
    }
}