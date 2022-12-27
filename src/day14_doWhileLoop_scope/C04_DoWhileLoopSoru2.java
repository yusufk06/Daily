package day14_doWhileLoop_scope;

import java.util.Scanner;

public class C04_DoWhileLoopSoru2 {
    public static void main(String[] args) {
    /*
    Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
     bulunuz, tamkare ise true değilse false yazdırınız.
 Ornek : input : 16, output: 4
     */
        int input=36;
        int karekok=1;
        boolean sonuc=false;


        while (karekok*karekok<=input){
            if (karekok*karekok==input){
                System.out.println("girilen sayinin karakoku : "+karekok);
                sonuc=true;
                break;
            }else {
                karekok++;
            }
        }
        System.out.println(sonuc);


        // do while loop ile yapalim

        input=144;
        karekok=1;
        sonuc=false;

        do {

            if (karekok*karekok==input){
                System.out.println("girilen sayinin karakoku : "+karekok);
                sonuc=true;
                break;
            }else {
                karekok++;
            }


        }while (karekok*karekok<=input);

        System.out.println(sonuc);
    }
}
