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
public class mark 
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Jumlah Sujek");
        
        int jb=input.nextInt();
        double jum_mark=0;
        for(int B=0; B<jb; B+=1)
        {
           
            for(int i=0; i<jb; i+=1)
            {
                System.out.println("Masukan Markah");
                int mark=input.nextInt();
                
                 jum_mark=jum_mark+mark;
                System.out.println("Jumlah Markah"+jum_mark);
                
                  {
                   
                    double peratus=jum_mark*100/mark;
                    System.out.println("Jumlah Peratus Adalah"+peratus);
                }
                
                
            }
        }
    }
}    

