/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author Root
 */
public class polymorphism {
     public static void main(String[] asdasd) {
     
//memanggil method dari semua class
Itik HewanItik = new Itik();
Jangkrik HewanJangkrik = new Jangkrik();

//membuat variabel untuk main class hewan dan semua method class hewan
Hewan h;
System.out.println("Itik");
h = HewanItik;
h.suara();
h.berjalan();

System.out.println("Jangkrik");
h = HewanJangkrik;
h.suara();
h.berjalan();




     
     
     }
}
