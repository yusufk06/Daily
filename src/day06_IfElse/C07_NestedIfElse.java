package day06_IfElse;

import java.util.Scanner;

public class C07_NestedIfElse {
    public static void main(String[] args) {
//Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya “Emekli olmak icin
        // .. Yil daha calisman gerekir” yazdirin.

       Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Cinsiyetinizi girin");
        char cinsiyet = scan.next().charAt(0);


        System.out.println("Lutfen yasinizi girin");
       int yas = scan.nextInt();

       if (cinsiyet == 'K' || cinsiyet == 'k') {
            if (yas < 18 || yas > 80) System.out.println("gecersiz yas");
            else if (yas >= 60)
                System.out.println("Emekli olabilirisn");

            else System.out.println("emekli olmak icin " + (60 - yas) + "yil daha calismalisin");
        } else System.out.println("gecersiz");



        }
    }





