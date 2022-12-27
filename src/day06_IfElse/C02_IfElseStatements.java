package day06_IfElse;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir harf isteyin, girilen karakter
        //kucuk harf ise onu buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char chr=scan.next().charAt(0);

        if (chr>='a' && chr<='z' ){
           // String str=String.valueOf(chr);
           // System.out.println(str.toUpperCase());
            System.out.println("buyuk harf : "+(char)(chr-32));
        } else {
            System.out.println("kucuk harf");
        }


    }
}
