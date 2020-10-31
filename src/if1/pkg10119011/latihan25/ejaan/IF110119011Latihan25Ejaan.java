/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan25.ejaan;

import java.util.Scanner;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan25Ejaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String namaDepan;
        int i=0;
        int j=1;
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukan nama depan anda untuk di eja : ");
        namaDepan = sc.next();
        
        String[] namaPanjang = namaDepan.split("");
        
        System.out.println("Ejaan untuk " + namaDepan + " adalah : ");
        while (i < namaPanjang.length) {
            System.out.println("Huruf ke-" + j + " : " + namaPanjang[i]);
            j = j+1;
            i++;
        }
    }   
}