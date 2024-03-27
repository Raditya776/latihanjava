/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hewan1;

/**
 *
 * @author Tri Wahyu
 */
class hewan{

    public  void suara(){
        System.out.println("Hewan bersuara : ");
    }
}
class ayam extends hewan {
    public void suara(){
        System.out.println("Ayam berkokok...");
    } 
}
class kucing extends hewan {
    public void suara(){
        System.out.println("Kucing mengeong");
    }
}
class kuda extends hewan {
    public void suara(){
        System.out.println("Kuda mengingik");
    }
}

public class  Hewan1{
    
    public static void main(String[] args){
        hewan HEWAN = new hewan();
        kuda KUDA =new kuda();
        kucing KUCING = new kucing();
        ayam AYAM = new ayam();
        
        HEWAN.suara();
        
        HEWAN = KUDA;
        HEWAN.suara();
        
        HEWAN = KUCING;
        HEWAN.suara();
        
        HEWAN = AYAM;
        HEWAN.suara();
        
    }
}