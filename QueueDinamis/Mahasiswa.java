/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QueueDinamis;

/**
 *
 * @author ACER
 */
public class Mahasiswa //implements Comparable {
{
    private String nama;
    private int nim;

    public Mahasiswa(int nim) {
        this.nim = nim;
    }

    public int getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String toString() {
        return "Nama : " + nama + " \t " + "Nim :" + nim + "\n";
    }

//    @Override
//    public int compareTo(Object o) {
//        if (nim == ((Mahasiswa) o).getNim()) {
//            return 0;
//        } else if (nim > ((Mahasiswa) o).getNim()) {
//            return 1;
//        } else {
//            return -1;
//        }
//    }
}

