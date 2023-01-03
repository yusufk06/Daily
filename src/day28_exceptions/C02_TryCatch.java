package day28_exceptions;

import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {
        /*
        Try -catch bloklarinin amaci; riski 0 yapmak degil kodun iyi anaaliz yapip javanin
        cozemeyecegi durumlarda ne yapmasini istedigimizi kendisine soylemektir

        Java try blogunda basedemeyecegi bir sorunla karsilasirsa siz o sorunu deklare edinceye
        kadar yani catch() satirina kadar calismayi durdurur.

        Bu durumda sorun olan satir ile catch satiri arasindaki kodlar CALISMAZ
         */

        //kullanicidan iki tamsayi alip sayilari birbirine bolup, sonucu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("birbirine bolmek icin  2 tamsayi giriniz");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();


        try {
            System.out.println("iki sayinin bolumu ; "+ (sayi1/sayi2));

            System.out.println("kontrol1");
            System.out.println("kontrol2");
            System.out.println("kontrol3");
        } catch (ArithmeticException e) {
            System.out.println("bolen sayi 0 olamaz");
            e.printStackTrace();
        }

    }
}
