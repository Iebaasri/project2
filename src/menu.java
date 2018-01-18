/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class menu {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Menu pilihan Anda:");
        System.out.println("1. Nama dan Np K/P");
        System.out.println("2. No. Telepon");
        System.out.println("3. Alamat");
        int m=input.nextInt();
        
        
        switch(m){
            case 1:
                System.out.println("Masukkan No Telefon"); 
                System.out.println("No Telefon ialah:");
                break;
            case 2:
                System.out.println("Nama:"+"\n"+ "No K/P:");
               break;
            case 3:
                System.out.println("Alamat:");
           
           
            
        }
    }
            
}
