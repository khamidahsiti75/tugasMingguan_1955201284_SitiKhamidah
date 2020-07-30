/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

import java.util.Scanner;
/**
 *
 * @author OWNER
 */
public class ArrayMultiDimensi {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int array2d[][] = new int [99][99];
        System.out.println("===========================");
        System.out.println("MENCETAK TABEL MATRIX =");
        System.out.println("===========================");
        System.out.print(" Masukkan Angka Start : ");
        int start = in.nextInt();
        System.out.print(" Masukkan Batas Kolom :");
        int kolom = in.nextInt();
        System.out.println(" Masukkan Batas Baris :");
        int baris = in.nextInt();
        System.out.println("===========================");
        
        for(int a=0;a<kolom;a++){
            for(int b=0;b<baris;b++){
                array2d[a][b] = start++;
            }
        }
        for(int b=0;b<baris;b++){
            for(int a=0;a<kolom;a++){
                System.out.println(array2d[a][b] + " ");
            }
            System.out.println("");
            }
    }
}  

        
                 
    

