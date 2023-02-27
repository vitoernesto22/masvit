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
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class QueueMainObj {

    public static void main(String[] args) {

        Queue antrian = new Queue();

        Mahasiswa mhs = new Mahasiswa(195314101);
        mhs.setNama("Laura");
        antrian.enqueue(mhs);

        mhs = new Mahasiswa(195314102);
        mhs.setNama("Dhani");
        antrian.enqueue(mhs);

        mhs = new Mahasiswa(195314103);
        mhs.setNama("Ahmad");
        antrian.enqueue(mhs);
        
       // antrian.elemen.search(mhs);
//
//        System.out.println(antrian.deque());
//        System.out.println(antrian.deque());
//        System.out.println(antrian.deque());

       
//           
        
        try {
//          
        antrian.elemen.print();
        } catch (NoSuchElementException ex) {
            System.out.println("Antrian sudah kosong!");
        } 
    }
}

