/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classscanner;

/**
 *
 * @author Tri Wahyu
 */
import java.util.Scanner;
public class ClassScanner {
 public String nama;
 public double n1;
 public int n2,n3;
 Scanner input = new Scanner(System.in);
 public String getnama(){
    return nama;
}
public void inputScanner(){
System.out.println("Masukan Nama Mahasiswa : ");
nama = input.nextLine();
System.out.println("Masukan Nilai 1 : ");
n1 = input.nextDouble();
System.out.println("Masukan Nilai 2 : ");
n2 = input.nextInt();
}
public double rata(){
return ((n1 + n2) /2);
    }
}