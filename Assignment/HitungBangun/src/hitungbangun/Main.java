/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hitungbangun;

import BangunDatar.Lingkaran;
import BangunDatar.Segitiga;
import BangunRuang.Tabung;
import BangunRuang.Limas;
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
        
        double pilih, segitiga, ttab, jtab, tlim, x, y, z;
        int menu;
        Scanner scanner = new Scanner (System.in);
        do{
            System.out.println("==========\n");
            System.out.println("Menu Utama\n");
            System.out.println("==========\n");
            System.out.println("1. Hitung Tabung");
            System.out.println("2. Hitung Limas");
            System.out.println("3. Exit");
            System.out.println("Pilih (1-3): ");
            System.out.println("");
            pilih = scanner.nextDouble();
            if(pilih == 1){

                System.out.println("Hitung Tabung");
                System.out.println("=============");
                System.out.println("");
                System.out.println(" Input tinggi: ");
                ttab = scanner.nextDouble();
                System.out.println(" Input jari-jari: ");
                jtab = scanner.nextDouble();
                Tabung tabung1 = new Tabung (ttab,jtab);
                System.out.println("");
                System.out.println("Hasil: \n");
                System.out.println(" Keliling lingkaran = " + tabung1.Keliling());
                System.out.println(" Luas lingkaran = " + tabung1.Luas());
                System.out.println(" Volume tabung = " + tabung1.Volume());
                System.out.println(" Luas permukaan tabung = " + tabung1.LuasPerm());
            }else if (pilih == 2){
                System.out.println("");
                System.out.println("Hitung Limas segitiga\n");
                System.out.println("============\n");
                System.out.println("");
                System.out.println("Jenis Segitiga:\n");
                System.out.println("1. Segitiga sama kaki\n");
                System.out.println("2. Segitiga sama sisi\n");
                System.out.println("3. Segitiga sembarang\n");
                System.out.println("Pilih (1-3): ");
                System.out.println("");
                segitiga = scanner.nextDouble();
                if(segitiga == 1){
                    System.out.println(" Input tinggi limas: ");
                    tlim = scanner.nextDouble();
                    System.out.println(" Input a: ");
                    x = scanner.nextDouble();
                    System.out.println(" Input b: ");
                    y = scanner.nextDouble();
                    System.out.println(" Input c: ");
                    z = scanner.nextDouble();
                    Limas limas1 = new Limas (tlim,x,y,z);
                    System.out.println("");
                    System.out.println("Hasil: \n");
                    System.out.println(" Keliling segitiga = " + limas1.Keliling());
                    System.out.println(" Luas segitiga = " + limas1.Luas());
                    System.out.println(" Volume limas = " + limas1.Volume());
                    System.out.println(" Luas permukaan limas = " + limas1.LuasPerm());
                    System.out.println("");
                }else if(segitiga == 2){
                    System.out.println(" Input tinggi limas: ");
                    tlim = scanner.nextDouble();
                    System.out.println(" Input a: ");
                    x = scanner.nextDouble();
                    System.out.println(" Input b: ");
                    y = scanner.nextDouble();
                    System.out.println(" Input c: ");
                    z = scanner.nextDouble();
                    Limas limas2 = new Limas (tlim,x,y,z);
                    System.out.println("");
                    System.out.println("Hasil: \n");
                    System.out.println(" Keliling segitiga = " + limas2.Keliling());
                    System.out.println(" Luas segitiga = " + limas2.Luas());
                    System.out.println(" Volume limas = " + limas2.Volume());
                    System.out.println(" Luas permukaan limas = " + limas2.LuasPerm());
                    System.out.println("");
                }else{
                    System.out.println(" Input tinggi limas: ");
                    tlim = scanner.nextDouble();
                    System.out.println(" Input a: ");
                    x = scanner.nextDouble();
                    System.out.println(" Input b: ");
                    y = scanner.nextDouble();
                    System.out.println(" Input c: ");
                    z = scanner.nextDouble();
                    Limas limas3 = new Limas (tlim,x,y,z);
                    System.out.println("");
                    System.out.println("Hasil: \n");
                    System.out.println(" Keliling segitiga = " + limas3.Keliling());
                    System.out.println(" Luas segitiga = " + limas3.Luas());
                    System.out.println(" Volume limas = " + limas3.Volume());
                    System.out.println(" Luas permukaan limas = " + limas3.LuasPerm());
                    System.out.println("");
                }
            }else{
                System.exit(0);
            }
        }while(pilih != 3);
    }
    
}
