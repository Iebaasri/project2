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
public class tinggi {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Masukan Ketinggian Anda");
        double t=input.nextDouble();
        {
            if(t<50)
                System.out.println("Anda Terlalu Pendek");
            else
                System.out.println("Ketinggian Normal");
        }
        
    }
}
