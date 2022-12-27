package day14_doWhileLoop_scope;

import java.util.Scanner;

public class C01_DoWhileLoop {
    public static void main(String[] args) {

        // kullanicidan  istedigi kadar sayi alin ve toplayin
        // kullanici deger olarak 0 a basarsa islemi bitirin


        int girilenSayi=1;
        int toplam=0;
        Scanner scan=new Scanner(System.in);
        while (girilenSayi!=0){
            System.out.println("Lutfen toplanmak icin bir tamsayi giriniz");
            girilenSayi=scan.nextInt();

            toplam+=girilenSayi;


        }
        System.out.println("girilen sayilarin toplami : "+ toplam);

        /*
        while looun 2 tane negatif yonu vardir
        1. loopdan once olusturdugumuz ve loopda kullanacagimiz variablelara yanlis bir deger
        verirsek  loop bodysi hic calismayabilir
        2. loop conditioni loop bodysinden bir kez fazla calisir
        bu negatif yonler onu kullanilmaz yapacak buyuklukte degildir
        ancak bu negatifliklerden kurtulmak istersek do while loop kullanabilirz

         */

    }
}
