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
public class Sifir1 
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Sifir Berapa ? - ");
            int s=input.nextInt();
        
         for(int num=1; num<=10; num++)
         {
            
           int total;
        total=s*num;
        System.out.println(num+"X"+s+"="+total);
          
         }
    }
}
