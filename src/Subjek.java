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
public class Subjek 
{
    
  public static void main(String args[])
  {
  Scanner input=new Scanner (System.in);
  System .out.print("Nama :");
  String name=input.nextLine();
  
  System.out.print("No Pelajar :");
  int no=input.nextInt();

  System.out.println("Subjek ");
  String sub1=input.next();
  String sub2=input.next();
  String sub3=input.next();
  
  System.out.println("Markah");
  int mark1=input.nextInt();
  int mark2=input.nextInt();
  int mark3=input.nextInt();

 
  int jum_mark=mark1+mark2+mark3;
  int purata=jum_mark/3;


System.out.println("Subjek" +"\t\t\t" + "markah");
System.out.println( sub1+"\t\t\t" +mark1);
System.out.println( sub2+"\t\t\t" +mark2);
System.out.println( sub3+"\t\t\t" +mark3);
System.out.println( "Jumlah Markah=" +jum_mark);
System.out.println( "Jumlah Purata=" +purata);



}

}
