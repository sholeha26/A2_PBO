/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest2;

/**
 *
 * @author USER
 */
public class DVD {
    String Nama_DVD, Nama_penyewa;
    int No, harga, tanggal;

    public DVD(int No, String Nama_DVD, String Nama_penyewa, int harga, int tanggal){
      this.No = No;
      this.Nama_DVD = Nama_DVD;
      this.Nama_penyewa = Nama_penyewa;
      this.harga = harga;
      this.tanggal = tanggal;
   }

    void display() {
        System.out.println("Nomor    : " + this.No);
        System.out.println("Nama DVD : " + this.Nama_DVD);
        System.out.println("Nama Penyewa    : " + this.Nama_penyewa);
        System.out.println("harga sewa     : " + this.harga);
        System.out.println("tanggal sewa      : " + this.tanggal);
    }

    public void setNama_DVD(String Nama_DVD) {
        this.Nama_DVD = Nama_DVD;
    }

    public void setNama_penyewa(String Nama_penyewa) {
        this.Nama_penyewa = Nama_penyewa;
    }

    public void setNo(int No) {
        this.No = No;
    }

    public void setharga(int harga) {
        this.harga = harga;
    }

    public void settanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    void disewa() {
        System.out.println(this.Nama_DVD + "sedang disewa");
    }

    void percobaan() {
        System.out.println(this.Nama_DVD + "sedang percobaan pemutaran");
    }

}
