/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.warnakepribadian.tugas;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan warna kepribadian
 */
public class Main {
    public static void main(String[] args){
        Warna dataWarna =new Warna();
        
        String pilihWarna = 
                dataWarna.red + "CEK" + dataWarna.green + " CEK" + dataWarna.yellow + " KEPRIBADIANMU" + dataWarna.cyan + " dari" + dataWarna.purple + " WARNA" + dataWarna.blue + " FAVORITMU" +"\n" +
                dataWarna.red + "MERAH" + "\n" +
                dataWarna.green + "HIJAU" + "\n" +
                dataWarna.yellow + "KUNING" + "\n" +
                dataWarna.blue + "BIRU" + "\n" +
                dataWarna.purple + "UNGU" + "\n" +
                dataWarna.black + "" + "\n" +
                "**gunakan huruf kapital";
        System.out.println(pilihWarna);
        dataWarna.inputWarna();
        dataWarna.inputNama();
        dataWarna.kondisiWarnaKepribadian();
        System.out.println("DIBUAT OLEH TATANG SULAEMAN");
    }
}
