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
public class berat 
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Mengira Berat Badan");
        int weight=input.nextInt();
        
        System.out.println("Mengira Tinggi");
        int T=input.nextInt();
        
        double bmi=weight/(T*T);
        
        if (weight<18.5)
            System.out.println("Kurang Berat Badan");
        
        else if (weight<25 && weight>18.5)
            System.out.println("Pada Tahap Normal");
        
        else if (weight<30)
            System.out.println("Berat Badan Berlebihan");
        
        else
            System.out.println("Gemok");
        
    }
}
        
        
        
        
        
        
        
        
        
            
                
                
            
        
            
       
        
        
        
    
    

