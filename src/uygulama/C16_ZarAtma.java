package uygulama;

import java.util.Random;
import java.util.Scanner;

public class C16_ZarAtma {
    public static void main(String[] args) {

      /*
      kullanicidan uc tane sayi alin sonra uc kere zar attirin kullanicin kazanmasi
       icin attigi sayilarin tuttugu sayilarin toplamindan kucuk olmasi gerekir
       */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 3 tane tam sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2=scan.nextInt();
        int sayi3= scan.nextInt();

        int toplam=0;
        int i=0;
        int z=0;

        Random rnd=new Random();
        while (z<3){
            z++;
            i=rnd.nextInt(1,7);
            System.out.println(i + " ");
            toplam+=i;
        }

        if ((sayi1+sayi2+sayi3)> (toplam )){
                System.out.println(" kazandiniz");
             }else System.out.println(" maalesef kazanamadiniz");

        //sayia = rnd.nextInt(1,7);
        //sayib = rnd.nextInt(1, 7);
       // sayic = rnd.nextInt(1, 7);
       // System.out.print(sayia);
       // System.out.print(sayib);
       // System.out.print(sayic);
      //  if ((sayi1+sayi2+sayi3)> (sayia+sayib+sayic )){
      //      System.out.println(" kazandiniz");
       // }else System.out.println(" maalesef kazanamadiniz");
    }
}
