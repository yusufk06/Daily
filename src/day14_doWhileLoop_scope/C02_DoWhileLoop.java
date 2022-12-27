package day14_doWhileLoop_scope;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        // kullanicidan  istedigi kadar sayi alin ve toplayin
        // kullanici deger olarak 0 a basarsa islemi bitirin


        int girilenSayi=0;
        int toplam=0;
        Scanner scan=new Scanner(System.in);

        do {
            System.out.println("Lutfen toplanmak icin tamsayi giriniz");
            girilenSayi= scan.nextInt();
            toplam+=girilenSayi;

        }while (girilenSayi!=0);

        System.out.println("girilen sayilarin toplami : "+ toplam);
   /*
   while loopda  ilk sart saglanmazsa loop bodys hic CALISMAZ
   do while loopda once body calistigi icin sart yanlis olsa bile
   loop bodysi en az bir kere calismis olur
    */

    }
}
