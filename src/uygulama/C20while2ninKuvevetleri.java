package uygulama;

import java.util.Scanner;

public class C20while2ninKuvevetleri {
    public static void main(String[] args) {

        //girilen sayiya kadar olan 2nin kuvvetleri

        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int input= scan.nextInt();
        int k =1;
        while (k<=input) {
            System.out.println(k);
            k=k*2;

        }

    }
}
