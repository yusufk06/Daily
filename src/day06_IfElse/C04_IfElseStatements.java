package day06_IfElse;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {
        //Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya “Emekli olmak icin
        // .. Yil daha calisman gerekir” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen Cinsiyetinizi girin E: Erkek , K: Kadin");
        char cinsiyet= scan.next().charAt(0);
            cinsiyet=Character.toUpperCase(cinsiyet);

        System.out.println("Lutfen yasinizi girin");
        int yas= scan.nextInt();


        if (cinsiyet=='K'){
            if (yas>=60) System.out.println("emekli olabilirsiniz");
            if (yas<60)System.out.println(60-yas + " yil daha calismalisiniz");

        }
        else if(cinsiyet=='E') {
            if (yas>=65  ) System.out.println("emekli olabilirsinz");
            if (65>yas) System.out.println((65-yas) + "yil daha calismalisiniz");


        }


    }
}
