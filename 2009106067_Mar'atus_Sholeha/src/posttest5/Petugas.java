/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

/**
 *
 * @author USER
 */
public class Petugas extends DVD{
    int Kode_Petugas;
    
    public Petugas(int No, int Kode_Petugas, String Nama_DVD, String Nama, int harga){
        super(No, Nama_DVD, Nama, harga);
        this.Kode_Petugas = Kode_Petugas;
   }
    
    Petugas(){
        
    }

    public int getKode_Petugas() {
        return Kode_Petugas;
    }

    public void setKode_Petugas(int Kode_Petugas) {
        this.Kode_Petugas = Kode_Petugas;
    }
    
    @Override
    void Tampil(){
        this.bayar();
    }

    @Override
    public void bayar() {
        System.out.println("Petugas " + this.Nama + " menerima uang sewa DVD secara cash"); 
    }
}
