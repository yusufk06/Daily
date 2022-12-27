package day06_IfElse;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char krk1 = scan.next().charAt(0);

        if (krk1 >= 'A' && krk1 <= 'Z') {
            System.out.println("Buyuk karakter");
        } else {
            System.out.println("kucuk harf");

        }

    }
}