/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

/**
 *
 * @author USER
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Admin extends Akun implements UserLevelA {
    private ArrayList<Petugas> dataPetugas;
    private ArrayList<Penyewa> dataPenyewa;
    private InputStreamReader prepare;
    private BufferedReader input;
    private int pilihan;

    public Admin(String username, String password, String nama, String jenisKelamin, String alamat,
            ArrayList<Petugas> dataPetugas, ArrayList<Penyewa> dataPenyewa) {
        super(username, password, nama, jenisKelamin, alamat);
        this.dataPetugas = dataPetugas;
        this.dataPenyewa = dataPenyewa;
        this.prepare = new InputStreamReader(System.in);
        this.input = new BufferedReader(prepare);
    }

    @Override
    public void showData() throws IOException {
        System.out.println("1. Petugas");
        System.out.println("2. Penyewa");
        System.out.print("Masukan pilihan : ");
        pilihan = Integer.parseInt(input.readLine());
        if (pilihan == 1) {
            for (int i = 0; i < dataPetugas.size(); i++) {
                System.out.println("Petugas ke - " + (i + 1));
                dataPetugas.get(i).profile();
            }
        } else {
            for (int i = 0; i < dataPenyewa.size(); i++) {
                System.out.println("Penyewa ke - " + (i + 1));
                dataPenyewa.get(i).profile();
            }
        }
    }

    @Override
    public void addData() throws IOException {
        System.out.println("1. Petugas");
        System.out.println("2. Penyewa");
        System.out.print("Masukan pilihan : ");
        pilihan = Integer.parseInt(input.readLine());
        if (pilihan == 1) {
            System.out.print("Masukan nama : ");
            String nama = input.readLine();
            System.out.print("Masukan jenis kelamin : ");
            String jenisKelamin = input.readLine();
            System.out.print("Masukan alamat : ");
            String alamat = input.readLine();
            dataPetugas.add(new Petugas("1234", nama, jenisKelamin, alamat ));
        } else {
            System.out.print("Masukan nama : ");
            String nama = input.readLine();
            System.out.print("Masukan nomor telepon : ");
            String no_hp = input.readLine();
            System.out.print("Masukan jenis kelamin : ");
            String jenisKelamin = input.readLine();
            System.out.print("Masukan alamat : ");
            String alamat = input.readLine();
            dataPenyewa.add(new Penyewa(no_hp, "1234", nama, no_hp, jenisKelamin, alamat));
        }
    }

    @Override
    public void updateData() throws IOException {
        System.out.println("1. Petuags");
        System.out.println("2. Penyewa");
        System.out.print("Masukan pilihan : ");
        pilihan = Integer.parseInt(input.readLine());
        if (pilihan == 1) {
            System.out.print("Masukan nama petugas : ");
            String nama = input.readLine();
            for (Petugas i : dataPetugas) {
                if (i.getNama().equals(nama)) {
                    System.out.print("Masukan nama baru : ");
                    i.setNama(input.readLine());
                    System.out.print("Masukan jenis kelamin baru : ");
                    i.setJenisKelamin(input.readLine());
                    System.out.print("Masukan alamat baru : ");
                    i.setAlamat(input.readLine());
                }
            }
        } else {
            System.out.print("Masukan nama penyewa : ");
            String nama = input.readLine();
            for (Penyewa i : dataPenyewa) {
                if (i.getNama().equals(nama)) {
                    System.out.print("Masukan nama baru : ");
                    i.setNama(input.readLine());
                    System.out.print("Masukan jenis kelamin baru : ");
                    i.setJenisKelamin(input.readLine());
                    System.out.print("Masukan alamat baru : ");
                    i.setAlamat(input.readLine());
                    System.out.print("Masukan nomor telepon baru baru : ");
                    i.setNo_Hp(input.readLine());
                }
            }
        }
    }

    @Override
    public void deleteData() throws IOException {
        // Vauwez 054
        System.out.println("1. Petugas");
        System.out.println("2. Penyewa");
        System.out.print("Masukan pilihan : ");
        pilihan = Integer.parseInt(input.readLine());
        if (pilihan == 1) {
            System.out.print("Masukan nama petugas : ");
            String nama = input.readLine();
            for (Petugas i : dataPetugas) {
                if (i.getNama().equals(nama)) {
                    dataPetugas.remove(i);
                }
            }
        } else {
            System.out.print("Masukan nama penyewa : ");
            String nama = input.readLine();
            for (int i = 0; i < dataPenyewa.size(); i++) {
                if (dataPenyewa.get(i).getNama().equals(nama)) {
                    dataPenyewa.remove(i);
                }
            }
        }
    }


    @Override
    public void menu() throws IOException {
        while (true) {
            System.out.println("=========================MENU=========================");
            System.out.println("|                  1.Masukkan Data                   |");
            System.out.println("|                  2.Tampilkan Data                  |");
            System.out.println("|                  3.Mengupdate Data                 |");
            System.out.println("|                  4.Menghapus Data                  |");
            System.out.println("|                      5.Keluar                      |");
            System.out.println("======================================================");
            System.out.print("Masukkan Pilihan : ");
            int menu = Integer.parseInt(input.readLine());
            switch (menu) {
                case 1:
                    this.addData();
                    break;
                case 2:
                    this.showData();
                    break;
                case 3:
                    this.updateData();
                    break;
                case 4:
                    this.deleteData();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("SALAH KLIK MENU!!! -_- ");
                    break;
            }
        }
    }

    @Override
    public void sortData() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void searchData() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}