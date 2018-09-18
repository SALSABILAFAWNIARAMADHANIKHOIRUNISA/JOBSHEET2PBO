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
public class ujiBus1 {
    public static void main(String[] args) {
        int password;

        Praktikum1 Tayo = new Praktikum1(40);
        Tayo.cetak();

        Tayo.getPenumpang(123);
        Tayo.cetak();

        Tayo.getPenumpang(121);
        Tayo.cetak();

        Tayo.getPenumpang(123);
        Tayo.cetak();

        System.out.println(" Rata-rata Penumpang : " + Tayo.getAverege());

    }
}
