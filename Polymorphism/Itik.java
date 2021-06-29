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
//membuat class hewan Itik(extends hewan) yaitu untuk memanggil fungsi dari Class lain ,
//sehingga tidak perlu membuat script yg sama pada class yg akan kita buat dg class sebelumnya
public class Itik extends Hewan {
    
    public void suara(){
    System.out.println("kuekkuekeuek");
    }
    
     public void berjalan(){
    System.out.println("berbaris dengan rapi");
    System.out.println("*-------------------*");
    }
}
