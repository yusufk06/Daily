package uygulama;

import java.util.Scanner;

public class C05_scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("isminizi yazin");

        String girilenIsim=scan.nextLine();

        System.out.println(girilenIsim.toUpperCase());
    }

}
