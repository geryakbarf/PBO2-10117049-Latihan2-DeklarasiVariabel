/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan2.deklarasivariabel;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama                 : Gery Akbar Fauzi
 * Kelas                : PBO2
 * Nim                  : 10117049
 * Deskripsi Program    : Program ini berisi program deklarasi dan pengaksesan 
 *                        variabel
 */
public class PBO210117049Latihan2DeklarasiVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Deklarasi Variabel
        int nilaiInt;
        final double PHI = 3.14; //konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        //Memberi Nilain ke Variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        //Menampilkan Hasil
        System.out.println();
        System.out.println("Isi Variabel Nilai    : "+ nilaiInt);
        System.out.println("Isi Variabel PHI      : "+ PHI);
        System.out.println("Isi Variabel Logika   : "+ nilaiLogika);
        System.out.println("Isi Variabel Karakter : "+ nilaiKarakter);
    }
    
}
