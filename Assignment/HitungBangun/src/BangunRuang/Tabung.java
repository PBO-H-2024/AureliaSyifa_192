/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

import BangunDatar.Lingkaran;
/**
 *
 * @author Lenovo
 */
public class Tabung extends Lingkaran implements HitungRuang{
    public double tinggi;
    public Tabung(double tinggi, double jari){
        super(jari);
        this.tinggi = tinggi;
    }
    @Override
    public double Volume(){
        return Luas()*tinggi;
    }
    @Override
    public double LuasPerm(){
        return 2*Luas()+Keliling()*tinggi; 
    }
    
}
