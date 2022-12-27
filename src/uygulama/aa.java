package uygulama;

import java.util.Random;
import java.util.Scanner;

public class aa {
    public static void main(String[] args) {

        Random rnd = new Random();
        int tutulanSayi = rnd.nextInt(100);

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int tahmin = scan.nextInt();

        int denemeSayisi = 0;


        while (tutulanSayi != tahmin) {
            if (tutulanSayi != tahmin) {
                if (tutulanSayi > tahmin) {
                    System.out.println("tahmininizi artırın");
                    denemeSayisi++;
                    tahmin = scan.nextInt();
                } else {
                    System.out.println("tahmininizi azaltın");
                    denemeSayisi++;
                    tahmin = scan.nextInt();
                }
            }


        }
        if (denemeSayisi <= 3) System.out.println("vaoooow");
        else if (denemeSayisi >= 4 && denemeSayisi <= 8) System.out.println("aferin");
        else System.out.println("başarısız, çok fazla deneme yaptınız:)");


    }
}