/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Root Sella
 */
//class pesawat disini berperan sebagai sub class dari super class
public class Pesawat {
    //overriding method=method yang terdapat di sub class

    void bergerak() {
        System.out.println("Pesawat bergerak");
    }

    void mempunyai() {
        System.out.println("Pesawat mempunyai 2 sayap");
    }

    public static void main(String[] args) {
        //Membuat objek pesawat
        Pesawat psw = new Pesawat();

        //Objek pesawat menggunakan method bergerak()
        psw.bergerak();
        psw.mempunyai();
    }

}
