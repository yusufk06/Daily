package uygulama;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class C19whileLoop {
    public static void main(String[] args) {

        //negatif bir deger girilene kadar kullanicidan girisleri kabul eden ve girilen degerlerden tek sayilari toplayan program
        Scanner scan=new Scanner(System.in);

        int tekSayilarToplami = 0;
        int i = 0;
        while (true) {
            System.out.println("Lutfen sayi giriniz");
            i= scan.nextInt();


            if (i<0){
                System.out.println("Program bitti girilen tek sayilar toplami :" + tekSayilarToplami);
                break;
            }
            if (i%2==1){
                //tekSayilarToplami=tekSayilarToplami+ i;
                tekSayilarToplami+=i;
            }
        }
    }
}