package day08_stringManipulation;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {
//Soru 4- Kullanicidan gunu ismini girmesini isteyin,
// girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var”
// seklinde hafta sonu tatiline kac gun kaldigini yazdirin, girilen gun hafta sonu
// ise “Simdi dinlenme zamani” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini girin");
        String girilenGun= scan.next();
        String kullanilacakGun=girilenGun.toLowerCase();


        /*
        string ifadeler case sensitivedir
        kullanicinin pazar, PAzar, PazaR, PAZAR... gibi 32 farkli sekilde yazma ihtimali var

         */
        switch (kullanilacakGun){

            case "pazartesi" :
                System.out.println(girilenGun + "calisma zamani , tatile 5 gun var");
                break;
            case "sali" :
                System.out.println(girilenGun + " calisma zamani , tatile 4 gun var");
                break;
            case "carsamba" :
                System.out.println(girilenGun + "calisma zamani , tatile 3 gun var");
                break;
            case "persembe" :
                System.out.println(girilenGun + "calisma zamani , tatile 2 gun var");
                break;
            case "cuma" :
                System.out.println(girilenGun + "calisma zamani , tatile 1 gun var");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("simdi dinlenme zamani");
                break;
            default:
                System.out.println("yanlis gun ismi");

        }




    }
}
