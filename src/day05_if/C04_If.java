package day05_if;

import java.util.Scanner;

public class C04_If {
    public static void main(String[] args) {

       /* Kullanicidan bir sayi alin sayi 3 ile bolunuyorsa uc ile bolunebilen sayi
       5 ile bolunebiliyorsa 5 ile bolunebilen sayi yazidirin

        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");

        int sayi= scan.nextInt();

        if (sayi%3==0){
            System.out.println("Uc ile bolunebilen sayi");
        }

        if (sayi%5==0){
            System.out.println("5 ile bolunebilen sayi");
        }



    }
}
