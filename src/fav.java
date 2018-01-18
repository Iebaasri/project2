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
public class fav 
{
    public static void main(String ags[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Biodata");
        
        System.out.println("Nama");
        String N=input.next();
        
        System.out.println("Jantina");
        String J=input.next();
        
        System.out.println("Warna Kegemaran");
        String W=input.next();
        
      
        
        switch (W)
                {
            case "Merah":
                System.out.println("kekuatan");
             break;
            case "Biru":
                System.out.println("ketenangan");
                
                break;
            case "Kuning":
                System.out.println("kegembiraan");
                
                break;
            case "Hijau":
                System.out.println("kehidupan");
                
            default:
                System.out.println("Salah Ejaan");
        }
    }
}
