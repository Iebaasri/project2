/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java .util.Scanner;
class barang
{
    public static void main(String args[])
    {      
            Scanner input=new Scanner(System.in);
    System.out.println("Bil");
    
    int Bil1=input.nextInt();
    int Bil2=input.nextInt();
    int Bil3=input.nextInt();
    
    System.out.println("Barang");
    
    String B1=input.next();
    String B2=input.next();
    String B3=input.next();
    
    System.out.println("Harga");
    
    double H1=input.nextDouble();
    double H2=input.nextDouble();
    double H3=input.nextDouble();
    
    double harga=H1+H3+H2+H1;
    double jumlah=H1+H2+H3;
    
    System.out.println("Bil" +"\t\t\t" + "Barang" +"\t\t\t" + "Harga" );
    System.out.println (Bil1+"\t\t\t" +B1+ "\t\t\t" +H1);
    System.out.println(Bil2+"\t\t\t" +B2+ "\t\t\t" +H2);
    System.out.println(Bil3+"\t\t\t" +B3+ "\t\t\t" +H3);
    System.out.println( "Harga Barang=" +harga);
    System.out.println( "Jumlah Barang=" +jumlah);
    
  
    

    

    
    

    }
}
