package uygulama;

import java.util.Scanner;

public class C00RakamlarToplami {
    public static void main(String[] args) {


       /* //Kullanicidan pozitif bir tamsayi alip,
        // rakamlar toplamini yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamakli pozitif bir tam sayı giriniz");
        int girilenSayi= scan.nextInt();
        int rakamlarToplami=0;
        int birlerBasamagi=0;

        birlerBasamagi=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        girilenSayi=girilenSayi/10;

        birlerBasamagi=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        girilenSayi=girilenSayi/10;

        birlerBasamagi=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        girilenSayi=girilenSayi/10;

        System.out.println("rakamlar toplami : " + rakamlarToplami );

*/



        //Kullanicidan pozitif bir tamsayi alip,
        // rakamlar toplamini yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("pozitif bir tam sayı giriniz");
        String str=scan.nextLine();
        int birlerbasma=0;
        int rakamlartop=0;
        int sayıuzunlu=str.length();
        int sayi=Integer.parseInt(str);

        for (int i = 1; i <=sayıuzunlu ; i++) {
            birlerbasma=sayi%10;
            rakamlartop=rakamlartop+birlerbasma;
            sayi=sayi/10;
        }
        System.out.println("rakamlar toplamı :"+rakamlartop);

    }

}