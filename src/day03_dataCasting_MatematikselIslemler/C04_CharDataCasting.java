package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen bir karakter yaziniz");

        char girilenKarakter= scan.next().charAt(0);

        System.out.println( (char)  (girilenKarakter+1)  );


    }
}
