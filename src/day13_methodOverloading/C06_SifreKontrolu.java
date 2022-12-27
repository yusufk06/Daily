package day13_methodOverloading;

import java.util.Scanner;

public class C06_SifreKontrolu {
    public static void main(String[] args) {
        /*
        Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve
         kullaniciya duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari
         saglarsa, “sifre basariyla kaydedildi” yazdirin
  - ilk harf kucuk harf olmali
  - son karakter rakam olmali
  - sifre bosluk icermemeli
  - uzunlugu en az 10 karakter olmali
         */

        //sifre kontrolunu bir method da yapip true / false dondurun
        //main method dadonen sonucu kontrol edip
        ////basari ile olusturuldu " yazinca ya kadar
        //sifreyi tekrar tekrar isteyin

        Scanner scan=new Scanner(System.in);

        boolean tekrarSifreIste=true;
        String sifre="";
         while (tekrarSifreIste){

             System.out.println("Lutfen sirferinizi giriniz");
             sifre= scan.nextLine();

             if (sifreKontrolEt(sifre)){ // sifre kontrolu true donerse sifre basarilidor
                 System.out.println("sifre basari ile olusturuldu");
                 //break; // alttakide aynisini yapar break ile
                 tekrarSifreIste=false; // break veya bu kod yazilabilir

             }
         }



    }

    public static boolean sifreKontrolEt(String sifre) {
        int flag = 0;
        //ilk harf kucuk harf olmali

        if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) { // ilk harf kucuk degilse hatayi yazdir
            System.out.println("ilk harf kucuk harf olmali");
            flag++; //bir ceza puani aldi
        }



        //      - son karakter rakam olmali

        if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
            // son karakter rakam degilse rapor yazdir
            System.out.println("son karakter rakam olmali");
            flag++;
        }



        //      - sifre bosluk icermemeli

        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");

            flag++;

        }
        // - uzunlugu en az 10 karakter olmali

        if (!(sifre.length() >= 10)) {
            System.out.println("sifrenin uzunlugu en az 10 karakter olmali");
            flag++;
        }



        if (flag == 0) {
            return true;
        }else{
            return false;
        }

    }
}