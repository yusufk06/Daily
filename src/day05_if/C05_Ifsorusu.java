package day05_if;

import java.util.Scanner;

public class C05_Ifsorusu {
    public static void main(String[] args) {

        /*oru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
                Kullanici o veya O yazdiginda output Ocak olsun.oru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
                Kullanici o veya O yazdiginda output Ocak olsun.

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yazdirmak istediginiz ayin ilk harfini girin");
        char ilkHarf=scan.next().charAt(0);
        if (ilkHarf=='o' || ilkHarf=='O') System.out.println("Ocak");
        if (ilkHarf=='s' || ilkHarf=='S') System.out.println("Subat");
        if (ilkHarf=='m' || ilkHarf=='M') System.out.println("Mart veya Mayis");
        if (ilkHarf=='n' || ilkHarf=='N') System.out.println("Nisan");
        if (ilkHarf=='h' || ilkHarf=='H') System.out.println("Haziran");
        if (ilkHarf=='t' || ilkHarf=='T') System.out.println("Temmuz");


    }
}
