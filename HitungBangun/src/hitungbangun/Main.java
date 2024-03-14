/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hitungbangun;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double pilih, ttab, jtab, alim, tseg, tlim;
        Scanner scanner = new Scanner (System.in);
        System.out.println("==========\n");
        System.out.println("Menu Utama\n");
        System.out.println("==========\n");
        System.out.println("1. Hitung Tabung");
        System.out.println("2. Hitung Limas");
        System.out.println("3. Exit");
        System.out.println("Pilih (1-3): ");
        pilih = scanner.nextDouble();
        if(pilih == 1){
            
            System.out.println("Hitung Tabung\n");
            System.out.println("=============\n");
            System.out.println(" Input tinggi: ");
            ttab = scanner.nextDouble();
            System.out.println(" Input jari-jari: ");
            jtab = scanner.nextDouble();
        }else if (pilih == 2){
            
            System.out.println("Hitung Limas\n");
            System.out.println("============\n");
            System.out.println(" Input alas: ");
            alim = scanner.nextDouble();
            System.out.println(" Input tinggi segitiga");
            tseg = scanner.nextDouble();
            System.out.println(" Input tinggi limas");
            tlim = scanner.nextDouble();
        }else{
            System.exit(0);
        }
    }
    
}
