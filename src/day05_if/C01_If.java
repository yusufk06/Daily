package day05_if;

import java.util.Scanner;

public class C01_If {

    public static void main(String[] args) {
        // ogrenciden notunu rakam olarak alip harf olarak yazdirin
        // 0-49,999  DD
        //50-64,999 CC
        // 65-84,999 BB
        //85-100 AA

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");
        double not = scan.nextDouble();

        if (0 <= not && not < 50) {
            System.out.println("Notunuz DD maalesef kaldiniz");

        }

        if (50 <= not && not < 65) {
            System.out.println("Notunuz CC");
        }

        if (65 <= not && not < 85) {
            System.out.println("Notunuz BB");

        }
        if (85 <= not && not <= 100) {
            System.out.println("Notunuz AA tebrikler");

        }
    }
    }