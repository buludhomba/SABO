/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Root Sella
 */
public class Number {

    // fungsi parameter integer
    static int namaLengkap(int x, int y) {
        return x + y;
    }

    //fungsi parameter string
    static String namaLengkap(String x, String y) {
        return x + y;
    }

    public static void main(String[] args) {
        String in = namaLengkap("Sella", " Putri");

        System.out.println("Nama Saya adalah : " + in);

    }
}
