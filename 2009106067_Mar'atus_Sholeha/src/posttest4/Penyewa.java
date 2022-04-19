/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

/**
 *
 * @author USER
 */
public class Penyewa extends DVD {
    int No_Telp,tanggal;
    
    public Penyewa(int No, String Nama_DVD, String Nama, int No_Telp,int harga, int tanggal){
        super(No, Nama_DVD, Nama, harga);
        this.No_Telp = No_Telp;
        this.tanggal = tanggal;
   }

    Penyewa(){
        
    }


    public int getNo_Telp() {
        return No_Telp;
    }

    public void setNo_Telp(int No_Telp) {
        this.No_Telp = No_Telp;
    }

    public int gettanggal() {
        return tanggal;
    }

    public void settanggal(int tanggal) {
        this.tanggal = tanggal;
    }
    
    void Tampil(){
        
    }
}
