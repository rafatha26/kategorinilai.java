/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FA506IC
 */
import java.util.Scanner;

public class kategorinilai {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Nama");
        String Nama = input.nextLine();
        System.out.println("Masukkan Nilai"+Nama);
        int nilai = input.nextInt();
        
        String predikat = null;
        String kategori = null;
        if(nilai > 95 && nilai <= 100){
            predikat = "A+";
            kategori = "sangat baik";
        }else if(nilai >90 && nilai <=95){
            predikat = "A";
            kategori = "sangat baik";
        }else if(nilai >85 && nilai <=90 ){
            predikat = "B+";
            kategori = "baik";
        }else if(nilai >80 && nilai <=85){
            predikat = "B";
            kategori = "Baik";
        }else if(nilai >75 && nilai <=80){
            predikat = "B-";
            kategori = "baik";
        }else if(nilai >70 && nilai <=75){
            predikat = "C+";
            kategori = "cukup";
        }else if(nilai >65 && nilai <=70 ){
            predikat = "C";
            kategori = "cukup";
        }else if(nilai >60 && nilai <=65){
            predikat = "C-";
            kategori = "cukup";
        }else if(nilai >55 && nilai <=60){
            predikat = "D+";
            kategori = "kurang";
        }else if(nilai >0 && nilai <=54){
            predikat = "D";
            kategori = "kurang";
        }
        System.out.println("Nama: "+Nama);
        System.out.println("nilai: "+nilai);
        System.out.println("predikat: "+predikat);
        System.out.println("kategori: "+kategori);
    }
    
}
