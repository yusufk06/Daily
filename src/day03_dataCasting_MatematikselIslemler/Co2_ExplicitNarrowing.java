package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class Co2_ExplicitNarrowing {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen bir sayi giriniz");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        System.out.println("iki sayinin bolme sonucu "+(double)sayi1/sayi2);


    }
}
