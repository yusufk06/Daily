package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C03_Datasoru {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir ondalikli sayi giriniz");
        double sayiDbl=scan.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz");
        int sayiInt=scan.nextInt();

        System.out.println((int)(sayiDbl/sayiInt));

    }
}
