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
public class Tempat {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan Tempat:");
        int T=input.nextInt();
        
            switch (T)
            {
                case 1:
                    System.out.println("Tempat Pertama dalam Perlumbaan");
                    break;
                case 2:
                    System.out.println("Tempat Kedua dalam Perlumbaan");
                    break;
                case 3:
                    System.out.println("Tempat Ketiga dalam Perlumbaan");
                default:
                    System.out.println("Maaf Salah Input");
                    
                
        }
    }
            
    
}
