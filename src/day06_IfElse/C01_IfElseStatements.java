package day06_IfElse;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {

        //   Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar
        //ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzun giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        double sayi3 = scan.nextDouble();

        if (sayi1 == sayi2 && sayi2 == sayi3 && sayi1 > 0) {
            System.out.println("ucgen eskenar");
        } else {
            System.out.println("eskenar ucgen degil");


        }

    }
    }