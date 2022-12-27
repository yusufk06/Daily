package uygulama;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Karesini almak istediginiz sayiyi giriniz");

        double girilenSayi= scan.nextDouble();

        System.out.println("Girilen sayinin karesi :"+girilenSayi*girilenSayi);

    }
}
