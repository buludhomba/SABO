/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Root Sella
 */
//class motor disini berperan sebagai sub class dari super class
public class Motor extends Kendaraan {

    //overriding method=method yang terdapat di sub class
    void bergerak() {
        System.out.println("Motor bergerak");
    }

    void mempunyai() {
        System.out.println("Motor mempunyai roda 2");
    }

    public static void main(String[] args) {
        //Membuat objek motor
        Motor motor = new Motor();

        //Objek motor menggunakan method bergerak()
        motor.bergerak();
        motor.mempunyai();
    }

}
