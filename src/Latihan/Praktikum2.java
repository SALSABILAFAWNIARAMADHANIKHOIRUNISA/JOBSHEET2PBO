/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;
import java.lang.Math;
/**
 *
 * @author Hp
 */
public class Praktikum2 {
    private double jarijari;
    public Praktikum2(double jarijari){
        this.jarijari = jarijari;
    }
    public void setJarijari(double jarijari){
        this.jarijari = jarijari;
    }
    public void showDiameter(){
    System.out.println("Diameter Bola : "+2*jarijari);
}
    public void showLuasPermukaan(){
        System.out.println("Luas Permukaan Bola : "+(4/3*Math.PI*Math.pow(jarijari, 3)));
    }
    public void showVolume(){
        System.out.println("Luas Permukaan Bola : "+(4*Math.PI*Math.pow(jarijari, 2)));
    }
}

