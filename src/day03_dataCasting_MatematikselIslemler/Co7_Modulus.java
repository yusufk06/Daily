package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class Co7_Modulus {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen 4 basamakli bir pozitif tamsayi girin");

        int sayi1= scan.nextInt();

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        birlerBasamagi= sayi1% 10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        sayi1=sayi1/10;

        birlerBasamagi=sayi1%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;

        sayi1=sayi1/10;

        birlerBasamagi=sayi1%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        sayi1=sayi1/10;


        birlerBasamagi=sayi1%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;


        System.out.println(rakamlarToplami);







    }
}
