package uygulama;

import java.util.Scanner;

public class C17_soru {
    public static void main(String[] args) {
        /*
        Kullanicidan main method icinde bir tamsayi alin.
         Girilen sayinin pozitif tam bolenleri sayisini bulup bize donduren bir method olusturun.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();
        int pozitifTamBolenleri=0;
        sayi++;
        pozitifTamBolenleri+=sayi;
        System.out.println(pozitifTamBolenleri);
    }

    public static int tamBolenler( int sayi){
        if (sayi%2==0){
            System.out.println("pozitif boleleri");


        }
        return sayi;
    }
}
