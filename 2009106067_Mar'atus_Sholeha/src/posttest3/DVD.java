/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

/**
 *
 * @author USER
 */
public class DVD {
    private String Nama_DVD, Nama_penyewa;
    private int No, harga, tanggal;

    DVD(int No, String Nama_DVD, String Nama_penyewa, int harga, int tanggal){
      this.No = No;
      this.Nama_DVD = Nama_DVD;
      this.Nama_penyewa = Nama_penyewa;
      this.harga = harga;
      this.tanggal = tanggal;
   }

    DVD() {

    }

    void Tampil(){
        
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

    public String getNama_DVD() {
        return Nama_DVD;
    }

    public String getNama_penyewa() {
        return Nama_penyewa;
    }

    public int getNo() {
        return No;
    }

    public int getharga() {
        return harga;
    }

    public int gettanggal() {
        return tanggal;
    }
    
    

    void disewa() {
        System.out.println("DVD "+this.Nama_DVD + " sedang disewa");
    }

    void percobaan() {
        System.out.println("DVD "+this.Nama_DVD + " sedang dalam percobaan pemutaran");
    }

}
