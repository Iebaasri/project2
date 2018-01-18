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
public class suhu 
{
     public static void main(String ags[])
     {       
       Scanner input=new Scanner(System.in);
       System.out.println("Suhu Badan Pesakit");
       double s=input.nextDouble();
       
    if(s >37 || s >98.6)
    {System.out.println(" Demam ");}
    
    else
    {System.out.println("Pesakit sihat");}
     }
     }
    

  