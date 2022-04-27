/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

/**
 *
 * @author USER
 */
public abstract class DVD {
    protected String Nama_DVD, Nama;
    protected int No, harga;
    protected final String jenis_pembayaran = "cash";
    
    //abstract
    public abstract void bayar();

    DVD(int No, String Nama_DVD, String Nama, int harga){
      this.No = No;
      this.Nama_DVD = Nama_DVD;
      this.Nama = Nama;
      this.harga = harga;
   }
    

    DVD() {

    }

    void Tampil(){
        
    }
    public void setNama_DVD(String Nama_DVD) {
        this.Nama_DVD = Nama_DVD;
    }

    
    public void setNo(int No) {
        this.No = No;
    }

    public void setharga(int harga) {
        this.harga = harga;
    }

    public String getNama_DVD() {
        return Nama_DVD;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }


    public int getNo() {
        return No;
    }

    public int getharga() {
        return harga;
    }


    void disewa() {
        System.out.println("DVD "+this.Nama_DVD + " sedang disewa");
    }

    void percobaan() {
        System.out.println("DVD "+this.Nama_DVD + " sedang dalam percobaan pemutaran");
    }

}
