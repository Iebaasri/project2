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
public class MarkahKeseluruhan {
    public static void main(String args[])
    {
        System.out.println("Markah Pelajar");
       int m=87;
        System.out.println("Fundamental of Programming="+m);
        
        int n=90;
        System.out.println("Computer Organization and Architecture="+n);
        
        int s=68;
         System.out.println("Web Programming="+s);
         
         int t=50;
          System.out.println("System Interface="+t);
          
          int mark=m+n+s+t;
          int pur=mark/4;
          double peratus=mark*100/(400);
          
          System.out.println("Jumalah Markah:"+mark);
           System.out.println("Purata Markah:"+pur);
            System.out.println("Peratus Markah:"+peratus); }
}
