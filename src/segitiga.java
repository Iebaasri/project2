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
public class segitiga {
    public static void main(String args[]){
         Scanner input=new Scanner(System.in);
        for(int i=1; i<=3; i+=1)
        {
      System.out.println("Masukkan Tapak dan Tinggi:");
            
      System.out.print("Tapak=");
      int tp=input.nextInt();
      
      System.out.print("Tinggi=");
      int tg=input.nextInt();
      
      int luas;
      luas=(tp*tg)/2;
       System.out.println("Luas="+luas);
      
    }
    }
    
}
