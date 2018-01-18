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
public class bmi 
{
    public static void main(String args[])
    {
        Scanner input=new Scanner (System.in);
  System.out.print("Masukkan berat:");
  double berat=input.nextDouble();
  System.out.print("Masukkan tinggi:");
  double tinggi=input.nextDouble();
double bmi= (tinggi*tinggi)/berat;

System.out.println("Jumlah BMI: "+bmi);
    
    
    
    
    }
    
}
