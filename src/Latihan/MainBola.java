/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Hp
 */
public class MainBola {
  public static void main(String[] args)  {
      double Jarijari = 14;
      Praktikum2 objekbola = new Praktikum2(7);
      objekbola.showDiameter();
      objekbola.showLuasPermukaan();
      objekbola.showVolume();
      objekbola.setJarijari(Jarijari);//manipulasi dengan variabel jari jari yang dibuat
      objekbola.showDiameter();
      objekbola.showLuasPermukaan();
      objekbola.showVolume();
  }
}

