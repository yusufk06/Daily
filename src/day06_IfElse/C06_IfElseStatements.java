package day06_IfElse;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan aldigi urun adedi ve ve
        // liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urun adedini girin");
        int urunAdedi= scan.nextInt();
        System.out.println("Lutfen liste fiyatini girin");
        double fiyat1= scan.nextDouble();


        System.out.println("Musteri kartiniz var mi \n E: Evet H: Hayir");
char kartVarmi=scan.next().charAt(0);

        if (kartVarmi=='E' && urunAdedi>10) {
            System.out.println("ucret :" + urunAdedi * fiyat1 *0.8);

        }else System.out.println("ucret :"+ urunAdedi*fiyat1*0.85);

        if (kartVarmi=='H' && urunAdedi>10){
            System.out.println("ucret : "+ urunAdedi*fiyat1*0.85);
        }else System.out.println("ucret :" + urunAdedi*fiyat1*0.9);

    }
}
