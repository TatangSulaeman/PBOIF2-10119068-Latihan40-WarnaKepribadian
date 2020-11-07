/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.warnakepribadian.tugas;

import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan warna kepribadian
 */
public class Warna {
    Scanner keyboard =new Scanner(System.in);
    String nama,warna;
    public static final String red = "\u001b[31m";
    public static final String green = "\u001b[32m";
    public static final String yellow = "\u001b[33m";
    public static final String blue = "\u001b[34m";
    public static final String purple = "\u001b[35m";
    public static final String cyan = "\u001b[36m";
    public static final String black = "\u001b[30m";
    
    public void inputWarna(){
        System.out.print("PILIH WARNA FAVORITMU : ");
        warna = keyboard.next();
    }
    
    public void inputNama(){
        System.out.print("NAMA KAMU : ");
        nama = keyboard.next();
    }
    
    public void kondisiWarnaKepribadian(){
        System.out.println("");
        System.out.println("----------HASIL TEST WARNA KEPRIBADIAN " + nama + "----------");
        if(null != warna)switch(warna){
            case "MERAH":
                String outputTextRed =
                    black + "Warna Favoritmu adalah " + red + warna + "\n" +
                    "1. Periang, " + "\n" +
                    "2. Pemberani, " + "\n" +
                    "3. Berani mengambil resiko dalam setiap langkah, " + "\n" +
                    "4. Menyukai tantangan, " + "\n" +
                    "5. Kurang sabar, " +
                    "6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol, " + "\n" +
                    "7. Memiliki energi kehangatan dan cinta, " ;
                System.out.println(outputTextRed);
                break;
            case "HIJAU" :
                String outputTextGreen = 
                    black + "Warna Favoritmu adalah " + green + warna + "\n" +
                    "1. Romantis, " + "\n"+
                    "2. Menyukai hal yang berbau alami dan keindahan, " + "\n" +
                    "3. Teguh pada prinsip, " + "\n" +
                    "4. Menginginkan kesempurnaan, " + "\n" +
                    "5. Mudah cemburu, " + "\n" +
                    "6. Mudah merasa iri, " + "\n" +
                    "7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan, " ;
                System.out.println(outputTextGreen);
                break;
            case "KUNING" :
                String outputTextYellow = 
                    black + "Warna Favoritmu adalah " + yellow + warna + "\n" +
                    "1. Optimis, " + "\n"+
                    "2. Suka Bergaul, " + "\n" +
                    "3. Periang, " + "\n" +
                    "4. Senang menolong, " + "\n" +
                    "5. Lincah dan aktif, " + "\n" +
                    "6. Tidak suka meremehkan kekurangan orang lain, " + "\n" +
                    "7. Loyal, " + "\n" +
                    "8. Hangat, " + "\n" +
                    "9. Meskipun karakternya oprimis dan idealis, seringkali goyah dan tidak stabil, " + "\n" +
                    "10. cenderung penakut, " ;
                System.out.println(outputTextYellow);
                break;
            case "BIRU" :
                String outputTextBlue = 
                    black + "Warna Favoritmu adalah " + blue + warna + "\n" +
                    "1. Menyenangkan, " + "\n"+
                    "2. Bijaksana, " + "\n" +
                    "3. Pembawaan diri tenang saat menghadapi masalah, " + "\n" +
                    "4. Dinamis, " + "\n" +
                    "5. Senang berbagi, " + "\n" +
                    "6. Bersahabat, " + "\n" +
                    "7. Tidak terlalu suka menjadi sorotan banyak orang, " + "\n" +
                    "8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai, ";
                System.out.println(outputTextBlue);
                break;
            case "UNGU" :
                String outputTextPurple = 
                    black + "Warna Favoritmu adalah " + purple + warna + "\n" +
                    "1. Optimis, " + "\n"+
                    "2. Tidak pernah ragu, " + "\n" +
                    "3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat, " + "\n" +
                    "4. Memiliki ambisi yang besar, " + "\n" +
                    "5. Memiliki empati yang besar, " + "\n" +
                    "6. Memilikimsisi misterius sebab seringkali menutupi perasaaanya, " + "\n" +
                    "7. Terkadang bersikap keras kepala dan angkuh, ";
                System.out.println(outputTextPurple);
                break;
            default:
            break;
        }
    }
}
