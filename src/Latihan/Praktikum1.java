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
public class Praktikum1{

    private double Penumpang, maxPenumpang, counter, newPenumpang;

    public Praktikum1(double maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        Penumpang = 0;
    }

    public void addPenumpang(double Penumpang) {
        double temp;
        temp = this.Penumpang + Penumpang;
        if (temp > maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.Penumpang = temp;
            counter++;
        }
    }

    public void getPenumpang(double password) {
        if (password == 123) {
            System.out.println("Password Benar");
            addPenumpang(15);
        } else {
            System.out.println("Password Salah");
        }
    }

    public double getAverege() {
        return Penumpang / counter;
    }

    public void cetak() {
        System.out.println("Penumpang bus sekarang adalah : " + Penumpang);
        System.out.println("Penumpang bus seharusnya adalah : " + maxPenumpang);

    }
}
