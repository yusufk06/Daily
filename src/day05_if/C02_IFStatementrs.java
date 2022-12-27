package day05_if;

import java.util.Scanner;

public class C02_IFStatementrs {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alip
        // pozitif ise pozitif sayi ,
        // 100 ile 999 arasinda ise (sinirlar dahil) pozitif 3 bas ayi
        //3 ile bolunebiliyorsa 3un kati
        //birler basamagi 7 ise mukemmel//
        //seceneklerinden uygun olanlari yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi>0) {
            System.out.println("Sayi pozitif");
        }

        if (100<=sayi && sayi<=999 ){
            System.out.println("Sayi pozitif 3 basamakli sayi");
        }

        if (sayi%3==0){
            System.out.println("3un kati");
        }

        if (sayi%10==7 || sayi%10==-7){
            System.out.println("Mukemmel");
        }




    }
}
