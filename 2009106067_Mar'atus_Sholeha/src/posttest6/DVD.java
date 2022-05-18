/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

import java.util.ArrayList;

public class DVD {
    private String nama;
    private String kode;
    private String dosen;
    private static ArrayList<DVD> dvd = new ArrayList<>();;

    public DVD(String nama, String kode, String dosen) {
        this.nama = nama;
        this.kode = kode;
        this.dosen = dosen;
        dvd.add(this);
    }

    public static ArrayList<DVD> getDVD() {
        return dvd;
    }

    public static void displayDVD() {
        if (dvd.isEmpty()) {
            System.out.println("Kelas kosong");
        } else {
            for (DVD k : dvd) {
                System.out.println("Nama kelas : " + k.nama);
                System.out.println("Kode kelas : " + k.kode);
                System.out.println("Dosen      : " + k.dosen);
                System.out.println("=========================================================");
            }
        }
    }

    public static void updateKelas(String namaKelas, String kodeKelas, String dosen) {
        for (DVD k : dvd) {
            if (k.nama.equals(namaKelas) && k.kode.equals(kodeKelas)) {
                k.dosen = dosen;
            }
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

}