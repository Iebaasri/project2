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
public class Lima {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Masukan Nombor Anda:");
        int jum=0;
        int i=0;
        do
        {
            int nom=input.nextInt();
             i++;
             jum+=nom;
        }
        while(i<=5);
        System.out.println("Jumlah"+jum);
        }
    }

