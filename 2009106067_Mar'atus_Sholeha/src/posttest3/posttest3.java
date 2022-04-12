/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest3;

/**
 *
 * @author USER
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class posttest3 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO code application logic here
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(prepare);
        ArrayList<DVD> dataDVD = new ArrayList<>();

        while (true) {
            System.out.println("=========================MENU=========================");
            System.out.println("|                  1.Masukkan Data                   |");
            System.out.println("|                  2.Tampilkan Data                  |");
            System.out.println("|                  3.Mengupdate Data                 |");
            System.out.println("|                  4.Menghapus Data                  |");
            System.out.println("|  5.Encapsulation (posttest sebelumnya constructor) |");
            System.out.println("|                      6.Keluar                      |");
            System.out.println("======================================================");
            System.out.print("Masukkan Pilihan : ");
            int menu = Integer.parseInt(input.readLine());
            switch (menu) {
                case 1 -> {
                    System.out.println("==> Masukkan Data <==");
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
                    DVD dataBaru = new DVD(No,Nama_DVD,Nama_penyewa,harga,tanggal);
                    dataDVD.add(dataBaru);
                }
                case 2 -> {
                    System.out.println("==> Menampilkan Data <==");
                    for (int i = 0; i < dataDVD.size(); i += 1) {
                        System.out.println("============== DVD ke- "+ (i+1 )+ "==============");
//                        System.out.println("DVD ke-" + (i + 1));
                        System.out.println("         Nomor : " + dataDVD.get(i).getNo());
                        System.out.println("         Nama DVD : " + dataDVD.get(i).getNama_DVD());
                        System.out.println("         Nama Penyewa : " + dataDVD.get(i).getNama_penyewa());
                        System.out.println("         Harga DVD : " + dataDVD.get(i).getharga());
                        System.out.println("         Tanggal sewa DVD : " + dataDVD.get(i).gettanggal());
                        System.out.println("======================================== ");
                        dataDVD.get(i).Tampil();
                    }
                }
                case 3 -> {
                    System.out.println("==> Update Data <==");
                    System.out.println("Masukkan Nama DVD yang ingin di update : ");
                    String nomor = input.readLine();
                    for (DVD dvd : dataDVD) {
                        if(dvd.getNama_DVD().equals(nomor)) {
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
                    System.out.println("==> Hapus Data <==");
                     System.out.print("Masukkan Nomor yang ingin di hapus : ");
                     int nomor1 = Integer.parseInt(input.readLine());
                     nomor1 -= 1;
                     if (dataDVD.size() > nomor1) {
                     dataDVD.remove(nomor1);
                     System.out.println("Data Berhasil Di Hapus :D!!!");
                     }
                }
                case 5 -> {
                    System.out.println("posttest sebelumnya Constructor di ubah menjadi Encapsulation : ");
                    DVD dvd1 = new DVD();
                    
                    dvd1.setNo(1);
                    dvd1.setNama_DVD("kimi no nawa");
                    dvd1.setNama_penyewa("sholeha");
                    dvd1.setharga(20000);
                    dvd1.settanggal(12);

                    System.out.println("Nomor        : " + dvd1.getNo());
                    System.out.println("Nama DVD     : " + dvd1.getNama_DVD());
                    System.out.println("Nama Penyewa : " + dvd1.getNama_penyewa());
                    System.out.println("Harga Sewa   : " + dvd1.getharga());
                    System.out.println("Tanggal Sewa : " + dvd1.gettanggal());
        
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