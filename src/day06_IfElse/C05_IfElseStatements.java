package day06_IfElse;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        // hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse obez,
        // 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse zayif yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kilonuzu giriniz");
        double kilo= scan.nextDouble();

        System.out.println("Lutfen boyunuzu giriniz");
        double boy= scan.nextDouble();

        double vki= kilo*10000 / (boy * boy);
        System.out.println("vucut kitle indeksiniz" + vki);
        if (vki>30){
            System.out.println("obez");
            }
        else if (vki<=30 && vki>=25){
            System.out.println("kilolu");


        } else if (vki<=25 && vki>=20) {
            System.out.println("normal");

        } else if (vki<=20) {
            System.out.println("zayif");


        }
    }
}
