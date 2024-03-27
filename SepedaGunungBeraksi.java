/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sepedagunungberaksi;

/**
 *
 * @author Tri Wahyu
 */
 class Sepeda {
    int kecepatan = 0;
    int gir = 0;

    void ubahGir(int pertambahanGir) {
        gir = gir + pertambahanGir;
        System.out.println("Gir: " + gir);
    }

    void tambahKecepatan(int pertambahanKecepatan) {
        kecepatan = kecepatan + pertambahanKecepatan;
        System.out.println("Kecepatan: " + kecepatan);
    }
}

class SepedaGunung extends Sepeda {
    int setSadel;

    public void setSadel(int nilaiSadel) {
        setSadel = nilaiSadel;
        System.out.println("Tinggi Sadel : " + setSadel);
    }
}

public class SepedaGunungBeraksi {

    public static void main(String[] args) {
        SepedaGunung sepedaku = new SepedaGunung();
        sepedaku.tambahKecepatan(10);
        sepedaku.ubahGir(2);
        sepedaku.setSadel(20);
    }
}
