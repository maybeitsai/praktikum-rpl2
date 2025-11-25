/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act_50422657;
import java.util.Scanner;

/**
 *
 * @author harry
 */
public class ACT_50422657 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();
        
        if(nilai >= 60) {
            System.out.println("Selamat, Anda LULUS!");
        }
        
        else {
            System.out.println("Maaf, Anda TIDAK LULUS.");
        }
        
    }
}
