package day06_IfElse;

import java.util.Scanner;

public class C08_IfElseStatements {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
        // oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
        //         yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin");
        int girilenSayi= scan.nextInt();

        if (girilenSayi%10!=0) System.out.println("tek sayi girdiniz");

    }

}

