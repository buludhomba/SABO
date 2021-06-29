/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Root Sella
 */
//class mobil disini berperan sebagai sub class dari super class
public class Mobil extends Kendaraan {

    //overriding method=method yang terdapat di sub class
    void bergerak() {
        System.out.println("Mobil bergerak");
    }

    void mempunyai() {
        System.out.println("Mobil mempunyai roda 4");
    }

    public static void main(String[] args) {
        //Membuat objek mobil
        Mobil mobil = new Mobil();

        //Objek mobil menggunakan method bergerak()
        mobil.bergerak();
        mobil.mempunyai();
    }

}
