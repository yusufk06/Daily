package day09_stringManipulation;

import java.util.Scanner;

public class C06_indexOf {
    public static void main(String[] args) {

        //kullanicidan aldigimiz cumle "cok" ile baslayan ilk kelimeyi yazdirin
        // cumlede cok kelimesi gecmiyorsa "cumlede cok ile baslayan kelime yok" yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String girilenCumle= scan.nextLine();

        //sinavlarimizda cokdan secmeli sorular kullaniyoruz
        //javayi cok seviyoruz
        //bu kadar coklu secenek olur mu?

        if (!girilenCumle.contains("cok")) {
            System.out.println("cumlede cok ile bas kelime yok");
        }
        else {
            int cokIndexi=girilenCumle.indexOf("cok");
            int boslukIndex=girilenCumle.indexOf(" ", cokIndexi+1);

            System.out.println(girilenCumle.substring(cokIndexi, boslukIndex));
        }




    }
}
