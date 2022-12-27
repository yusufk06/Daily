package uygulama;

import java.util.Scanner;

public class C10_Scan {
    public static void main(String[] args) {
        /*
        kullanicidnan bir double birde int sayi alip bunlarin toplamini ve carpimini yazdirin

         */


        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen bir ondalikli sayi girin");

        double sayiDbl= scan.nextDouble();

        System.out.println(" lutfen bir tam sayi girin");

        int sayiInt = scan.nextInt();

        System.out.println("sayilarin toplami: + (sayiDbl+sayiInt");

        System.out.println("sayilarin carpimi: +sayiDbl*sayiInt");


    }
}
