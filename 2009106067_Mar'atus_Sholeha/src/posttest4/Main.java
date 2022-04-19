/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest4;

/**
 *
 * @author USER
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO code application logic here
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(prepare);
//        ArrayList<DVD> dataDVD = new ArrayList<>();
        ArrayList<Penyewa> dataPenyewa = new ArrayList<>();
        ArrayList<Petugas> dataPetugas = new ArrayList<>();
        int pilihan;
        
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
                case 1 -> {
                    System.out.println("1. Penyewa");
                    System.out.println("2. Petugas");
                    System.out.println("Masukan pilihan : ");
                    pilihan = Integer.parseInt(input.readLine());
                    if (pilihan == 1) {
                    System.out.println("==> Masukkan Data <==");
                    System.out.print("Masukkan Nomor : ");
                    int No = Integer.parseInt(input.readLine());
                    System.out.print("Masukkan Nama DVD : ");
                    String Nama_DVD = input.readLine();
                    System.out.print("Masukkan Nama Penyewa : ");
                    String Nama_penyewa = input.readLine();
                    System.out.print("Masukkan Nomor Telepon : ");
                    int No_Telp = Integer.parseInt(input.readLine());
                    System.out.print("Masukkan Harga Sewa : ");
                    int harga = Integer.parseInt(input.readLine());
                    System.out.print("Masukkan Tanggal Sewa : ");
                    int tanggal = Integer.parseInt(input.readLine());
                    dataPenyewa.add(new Penyewa (No,Nama_DVD,Nama_penyewa,No_Telp,harga,tanggal));
                    } else {
                        System.out.println("==> Masukkan Data <==");
                    System.out.print("Masukkan Nomor : ");
                    int No = Integer.parseInt(input.readLine());
                    System.out.print("Masukkan Kode Petugas : ");
                    int Kode_Petugas = Integer.parseInt(input.readLine());
                    System.out.print("Masukkan Nama DVD : ");
                    String Nama_DVD = input.readLine();
                    System.out.print("Masukkan Nama Petugas : ");
                    String Nama = input.readLine();
                    System.out.print("Masukkan Harga Sewa : ");
                    int harga = Integer.parseInt(input.readLine());
                    dataPetugas.add(new Petugas(No, Kode_Petugas,Nama_DVD,Nama,harga));
                    }
                }
                case 2 -> {
                    System.out.println("==> Menampilkan Data <==");
                    System.out.println("1. Penyewa");
                    System.out.println("2. Petugas");
                    System.out.println("Masukan pilihan : ");
                    pilihan = Integer.parseInt(input.readLine());
                    if (pilihan == 1) {
                    for (int i = 0; i < dataPenyewa.size(); i += 1) {
                        System.out.println("=============== DVD ke- "+ (i+1 )+ "===============");
//                        System.out.println("DVD ke-" + (i + 1));
                        System.out.println("         Nomor        : " + dataPenyewa.get(i).getNo());
                        System.out.println("         Nama DVD     : " + dataPenyewa.get(i).getNama_DVD());
                        System.out.println("         Nama Penyewa : " + dataPenyewa.get(i).getNama());
                        System.out.println("         Nomor Telepon: " + dataPenyewa.get(i).getNo_Telp());
                        System.out.println("         Harga DVD    : " + dataPenyewa.get(i).getharga());
                        System.out.println("         Tanggal sewa DVD : " + dataPenyewa.get(i).gettanggal());
                        System.out.println("======================================== ");
                        dataPenyewa.get(i).Tampil();
                    }
                    } else {
                        for (int i = 0; i < dataPetugas.size(); i += 1) {
                        System.out.println("=============== DVD ke- "+ (i+1 )+ "===============");
//                        System.out.println("DVD ke-" + (i + 1));
                        System.out.println("         Nomor : " + dataPetugas.get(i).getNo());
                        System.out.println("         Kode Petugas : " + dataPetugas.get(i).getKode_Petugas());
                        System.out.println("         Nama DVD : " + dataPetugas.get(i).getNama_DVD());
                        System.out.println("         Nama Petugas : " + dataPetugas.get(i).getNama());
                        System.out.println("         Harga DVD : " + dataPetugas.get(i).getharga());
                        System.out.println("======================================== ");
                        dataPetugas.get(i).Tampil();
                    }
                    }
                }
                case 3 -> {
                    System.out.println("==> Update Data <==");
                    System.out.println("1. Penyewa");
                    System.out.println("2. Pelanggan");
                    System.out.println("Masukan pilihan : ");
                    pilihan = Integer.parseInt(input.readLine());
                    if (pilihan == 1) {
                    System.out.println("Masukkan Nama DVD yang ingin di update : ");
                    String nomor = input.readLine();
                    for (Penyewa pnyw : dataPenyewa) {
                        if(pnyw.getNama_DVD().equals(nomor)) {
                            System.out.print("Masukkan Nama DVD baru : ");
                            pnyw.setNama_DVD(input.readLine());
                            System.out.print("Masukkan Nama Penyewa Baru : ");
                            pnyw.setNama(input.readLine());
                            System.out.print("Masukkan Nomor Telepon Baru : ");
                            pnyw.setNo_Telp(Integer.parseInt(input.readLine()));
                            System.out.print("Masukkan Harga Sewa Baru : ");
                            pnyw.setharga(Integer.parseInt(input.readLine()));
                            System.out.print("Masukkan Tanggal Sewa Baru : ");
                            pnyw.settanggal(Integer.parseInt(input.readLine()));
                            break;
                        }
                    }
                    } else {
                        System.out.println("Masukkan Nama DVD yang ingin di update : ");
                    String nomor = input.readLine();
                    for (Petugas ptgs : dataPetugas) {
                        if(ptgs.getNama_DVD().equals(nomor)) {
                            System.out.print("Masukkan Nama DVD baru : ");
                            ptgs.setNama_DVD(input.readLine());
                            System.out.print("Masukkan Kode Petugas yang Baru : ");
                            ptgs.setKode_Petugas(Integer.parseInt(input.readLine()));
                            System.out.print("Masukkan Nama Petugas Baru : ");
                            ptgs.setNama(input.readLine());
                            System.out.print("Masukkan Harga Sewa Baru : ");
                            ptgs.setharga(Integer.parseInt(input.readLine()));
                            break;
                        }
                    }
                    }
                }
                case 4 -> {
                    System.out.println("==> Hapus Data <==");
                    System.out.println("1. Penyewa");
                    System.out.println("2. Petugas");
                    System.out.println("Masukan pilihan : ");
                    pilihan = Integer.parseInt(input.readLine());
                    if (pilihan == 1) {
                     System.out.print("Masukkan Nomor yang ingin di hapus : ");
                     int nomor1 = Integer.parseInt(input.readLine());
                     nomor1 -= 1;
                     if (dataPenyewa.size() > nomor1) {
                     dataPenyewa.remove(nomor1);
                     System.out.println("Data Berhasil Di Hapus :D!!!");
                     }
                    }else {
                        System.out.print("Masukkan Nomor yang ingin di hapus : ");
                        int nomor1 = Integer.parseInt(input.readLine());
                        nomor1 -= 1;
                        if (dataPetugas.size() > nomor1) {
                        dataPetugas.remove(nomor1);
                        System.out.println("Data Berhasil Di Hapus :D!!!");
                     }
                     }
                    }
                case 5 -> {
                    System.out.println("TERIMAKASIH SUDAH MAMPIR ^.^");
                    System.exit(0);
                }
                default -> System.out.println("SALAH KLIK MENU!!! -_- ");
            }
        }

    }
}