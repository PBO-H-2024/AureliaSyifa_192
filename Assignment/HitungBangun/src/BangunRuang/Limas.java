/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

import BangunDatar.Segitiga;
/**
 *
 * @author Lenovo
 */
public class Limas extends Segitiga implements HitungRuang{
    public double tinggi;
    public Limas(double tinggi, double a, double b, double c){
        super(a,b,c);
        this.tinggi = tinggi;
    }
    @Override
    public double Volume(){
        return (Luas()*tinggi)/3;
    }
    @Override
    public double LuasPerm(){
        return 4*Luas();
    }
}
