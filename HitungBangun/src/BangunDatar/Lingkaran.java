/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author Lenovo
 */
public class Lingkaran implements HitungBidang{
    public double phi, jari;
    public Lingkaran (double jari){
        this.jari = jari;
        phi = 22.0/7.0;
    }
    @Override
    public double Luas(){
        return phi*jari*jari;
    }
    @Override
    public double Keliling(){
        return 2*phi*jari;
    }
}


