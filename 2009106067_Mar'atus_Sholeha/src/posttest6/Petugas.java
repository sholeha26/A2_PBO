/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

import java.io.IOException;
import java.util.ArrayList;

public class Petugas extends Akun implements UserLevelB, UserLevelC {
    private ArrayList<DVD> dvd;


    // Constructor
    public Petugas(String username, String password, String nama, String jenisKelamin, String alamat) {
        super(username, password, nama, jenisKelamin, alamat);
        dvd = new ArrayList<>();
    }

    Petugas(String string, String nama, String jenisKelamin, String alamat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

//    Petugas(String string, String nama, String jenisKelamin, String alamat) {
//        
//    }

    // Setter & Getter

    public ArrayList<DVD> getDVD() {
        return dvd;
    }

    public void setDVD(ArrayList<DVD> dvd) {
        this.dvd = dvd;
    }

    @Override
    public void profile() {
        System.out.println("=========================================================");
        super.profile();
        System.out.println("=========================================================");
    }

    public void joinKelas() {
        try {
            DVD.displayDVD();
            System.out.println("Masukan kode kelas : ");
            String kodeKelas = input.readLine();
            for (DVD k : DVD.getDVD()) {
                if (k.getKode().equals(kodeKelas) && !k.getDosen().equals(this.nama)) {
                    dvd.add(k);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void TambahDVD() {
        try {
            System.out.println("Masukan nama DVD : ");
            String namaKelas = input.readLine();
            System.out.println("Masukan kode DVD : ");
            String kodeKelas = input.readLine();
            this.dvd.add(new DVD(namaKelas, kodeKelas, this.nama));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void hapusDVD() {
        try {
            if (this.dvd.isEmpty()) {
                System.out.println("list DVD kosong");
            } else {
                System.out.println("Masukan kode DVD : ");
                String kodeKelas;
                kodeKelas = input.readLine();
                for (int i = 0; i < this.dvd.size(); i++) {
                    if (this.dvd.get(i).getNama().equals(kodeKelas)) {
                        this.dvd.remove(i);
                        System.out.println("DVD berhasil dihapus");
                        return;
                    }
                }
                System.out.println("DVD tidak di temukan");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void lihatDVD() {
        if (this.dvd.isEmpty()) {
            System.out.println("DVD : " + this.nama + " belum memasukkan list DVD");
        } else {
            System.out.println("===============================");
            System.out.println("DVD yang dimiliki : ");
            System.out.println("===============================");
            for (DVD dvd2 : this.dvd) {
                System.out.println("DVD ke-" + dvd.indexOf(dvd2) + 1 + " : ");
                System.out.println("Judul DVD : " + dvd2.getNama());
                System.out.println("Kode DVD : " + dvd2.getKode());
                System.out.println("Petugas      : " + dvd2.getDosen());
                System.out.println("-------------------------------");
            }
        }
    }

    public void ubahDVD() {
        try {
            if (this.dvd.isEmpty()) {
                System.out.println("DVD : " + this.nama + " belum memasukkan list DVD");
            } else {
                System.out.println("Masukan nama DVD : ");
                String namaDVD;
                namaDVD = input.readLine();
                System.out.println("Masukan kode DVD : ");
                String kodeKelas = input.readLine();
                for (int i = 0; i < this.dvd.size(); i++) {
                    if (this.dvd.get(i).getNama().equals(namaDVD)) {
                        this.dvd.get(i).setNama(namaDVD);
                        this.dvd.get(i).setKode(kodeKelas);
                        System.out.println("status DVD berhasil diubah");
                        return;
                    }
                }
                System.out.println("DVD tidak ditemukan");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void menu() {
        try {
            while (true) {
                DVD.displayDVD();
                System.out.println("==========================");
                System.out.println("1. Lihat list DVD");
                System.out.println("2. Tambah DVD");
                System.out.println("3. Hapus DVD");
                System.out.println("4. Profile");
                System.out.println("5. Logout");
                System.out.println("==========================");
                System.out.println("Pilih menu: ");
                pilihan = Integer.parseInt(input.readLine());
                switch (pilihan) {
                    case 1:
                        this.lihatDVD();
                        break;
                    case 2:
                        this.buatKelas();
                        break;
                    case 3:
                        this.hapusDVD();
                        break;
                    case 4:
                        this.profile();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Pilihan tidak tersedia");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @Override
    public void buatKelas() {
        
    }
}