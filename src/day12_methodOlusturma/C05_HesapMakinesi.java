package day12_methodOlusturma;

import java.util.Scanner;

public class C05_HesapMakinesi {
    public static void main(String[] args) {

        //kullanicidan iki sayi ve sitedigi islemi alin(+ / * -)
        //bir method olusturup sayilara istenen islemi uygulayio
        //sonucu bize dondurun
        // kullanici islemi yanlis secmisse 0 dondurun
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 2 sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("Lutfen bir islem secin + , - , / , *");
        char islem=scan.next().charAt(0);
        System.out.println(hesapMakinesi(sayi1, sayi2, islem));

    }
        public static  double hesapMakinesi(double sayi1 , double sayi2, char islem) {
        switch (islem){

            case'+':
                return  sayi1+sayi2;
            case '-':
                return  sayi1-sayi2;
            case '/' :
                return sayi1/sayi2;
            case '*' :
                return sayi1*sayi2;
            default:
                return 0;




        }
    }


}
