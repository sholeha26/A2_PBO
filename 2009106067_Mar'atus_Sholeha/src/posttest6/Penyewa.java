/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

/**
 *
 * @author USER
 */
import java.io.IOException;
import java.util.ArrayList;

public class Penyewa extends Akun implements UserLevelC {
    private ArrayList<DVD> dvd;
    private String no_hp;

    // Constructor
    public Penyewa(String username, String password, String nama, String jenisKelamin, String alamat, String no_hp) {
        super(username, password, nama, jenisKelamin, alamat);
        this.no_hp = no_hp;
        dvd = new ArrayList<>();
    }

    // Setter & Getter
    public String getNo_Hp() {
        return no_hp;
    }

    public void setNo_Hp(String no_hp) {
        this.no_hp = no_hp;
    }

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
        System.out.println("Nomor HP           : " + this.no_hp);
        System.out.println("=========================================================");
    }

    public void joinKelas() {
        try {
            DVD.displayDVD();
            System.out.println("Masukan kode DVD : ");
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

    public void buatDVD() {
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
                System.out.println("DVD tidak ditemukan");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void lihatKelas() {
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

    public void ubahKelas() {
        try {
            if (this.dvd.isEmpty()) {
                System.out.println("DVD : " + this.nama + " belum memasukkan list DVD yang akan di sewa");
            } else {
                System.out.println("Masukan nama DVD : ");
                String namaKelas;
                namaKelas = input.readLine();
                System.out.println("Masukan kode DVD : ");
                String kodeKelas = input.readLine();
                for (int i = 0; i < this.dvd.size(); i++) {
                    if (this.dvd.get(i).getNama().equals(namaKelas)) {
                        this.dvd.get(i).setNama(namaKelas);
                        this.dvd.get(i).setKode(kodeKelas);
                        System.out.println("DVD berhasil diubah");
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
                System.out.println("1. Lihat Sewa DVD");
                System.out.println("2. Tambah Sewa DVD");
                System.out.println("3. Hapus Sewa DVD");
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
                        this.buatDVD();
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
    public void lihatDVD() {
        
    }
}