
import java.util.Scanner;
public class gajibulanan {

public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
int gaji;
System.out.println("Masukkan Nama Anda");
String nama=input.next();

System.out.println("Masukkan Bilangan Jam sehari tidak melebihi 9 jam");
int jam=input.nextInt();
    
{
 if (jam>9);
{
System.out.println("Bilangan jam sehari tidak melebihi 9 jam. Sila isi bilangan yang betul");
}
System.out.println("Masukkan Bil hari tidak melebihi 30 hari");
int bilhari=input.nextInt();

if(bilhari>30);
{
System.out.println("Bil hari tidak melebihi 30 hari.Sila isi bilangan hari yang betul");
}
System.out.println("Masukkan bil jam tidak melebihi 50 jam");
int bilj=input.nextInt();
if (bilj>50);
{
System.out.println("Bil jam tidak melebihi 50 jam. Sila isi bilangan jam yang betul");
}
gaji=(jam*bilhari*20)+(bilj*15);

System.out.println("Rumusan gaji bulanan="+nama);
System.out.println("Jumlh jam bekerja="+jam);
System.out.println("Jumlah hari bekerja="+bilhari);
System.out.println("Jumlah jam lebih masa="+bilj);
System.out.println("JUMLAH GAJI=RM "+gaji);
}
}
}





