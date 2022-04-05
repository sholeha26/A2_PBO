/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest2;

/**
 *
 * @author USER
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class posttest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws NumberFormatException, IOException {
        // TODO code application logic here
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(prepare);
        ArrayList<DVD> dataDVD = new ArrayList<>();

        while (true) {
            System.out.println("=========MENU========");
            System.out.println("| 1.Masukkan Data   |");
            System.out.println("| 2.Tampilkan Data  |");
            System.out.println("| 3.Mengupdate Data |");
            System.out.println("| 4.Menghapus Data  |");
            System.out.println("| 5.Constructor     |");
            System.out.println("| 6.Keluar          |");
            System.out.println("=====================");
            System.out.print("Masukkan Pilihan : ");
            int menu = Integer.parseInt(input.readLine());
            switch (menu) {
                case 1 -> {
                    System.out.println("Masukkan Data ");
                    System.out.print("Masukkan Nomor : ");
                    int No = Integer.parseInt(input.readLine());
                    System.out.print("Masukkan Nama DVD : ");
                    String Nama_DVD = input.readLine();
                    System.out.print("Masukkan Nama Penyewa : ");
                    String Nama_penyewa = input.readLine();
                    System.out.print("Masukkan Harga Sewa : ");
                    int harga = Integer.parseInt(input.readLine());
                    System.out.print("Masukkan Tanggal Sewa : ");
                    int tanggal = Integer.parseInt(input.readLine());
                    // Mobil mobil = new Mobil(nama, merk, plat, cc);
                    DVD dataBaru = new DVD(No,Nama_DVD,Nama_penyewa,harga,tanggal);
                    dataDVD.add(dataBaru);
                }
                case 2 -> {
                    System.out.println("Read");
                    for (int i = 0; i < dataDVD.size(); i += 1) {
                        System.out.println("DVD ke-" + (i + 1));
                        dataDVD.get(i).display();
                    }
                }
                case 3 -> {
                    System.out.println("Update");
                    System.out.println("Masukkan Nama DVD yang ingin di update : ");
                    String nomor = input.readLine();
                    for (DVD dvd : dataDVD) {
                        if(dvd.Nama_DVD.equals(nomor)) {
                            System.out.print("Masukkan Nama DVD baru : ");
                            dvd.setNama_DVD(input.readLine());
                            System.out.print("Masukkan Nama Penyewa Baru : ");
                            dvd.setNama_penyewa(input.readLine());
                            System.out.print("Masukkan Harga Sewa Baru : ");
                            dvd.setharga(Integer.parseInt(input.readLine()));
                            System.out.print("Masukkan Tanggal Sewa Baru : ");
                            dvd.settanggal(Integer.parseInt(input.readLine()));
                            break;
                        }
                    }
                }
                case 4 -> {
                     System.out.println("Masukkan Nomor yang ingin di hapus : ");
                     int nomor1 = Integer.parseInt(input.readLine());
                     nomor1 -= 1;
                     if (dataDVD.size() > nomor1) {
                     dataDVD.remove(nomor1);
                     System.out.println("Data Berhasil Di Hapus :D!!!");
                     }
                }
                case 5 -> {
                    System.out.println("TERIMAKASIH SUDAH MAMPIR ^.^");
                    DVD dvd1 =  new DVD(1,"titanic","sholeha",12000,12);
        
                    dvd1.No= 1;
                    dvd1.Nama_DVD = "titanic";
                    dvd1.Nama_penyewa = "sholeha";
                    dvd1.harga = 12000;
                    dvd1.tanggal = 12;
        
                    System.out.println("Nomor DVD : " + dvd1.No );
                    System.out.println("Nama DVD : " + dvd1.Nama_DVD );
                    System.out.println("Nama penyewa : " + dvd1.Nama_penyewa );
                    System.out.println("Harga sewa : " + dvd1.harga );
                    System.out.println("Tanggal sewa : " + dvd1.tanggal );
        
                    dvd1.disewa();
                    dvd1.percobaan();
                    break;
                }
                case 6 -> {
                    System.out.println("TERIMAKASIH SUDAH MAMPIR ^.^");
                    System.exit(0);
                }
                default -> System.out.println("SALAH KLIK MENU!!! -_- ");
            }
        }

    }
    
}
