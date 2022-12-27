package uygulama;

import java.util.Locale;
import java.util.Scanner;

public class C14_Soru {
    public static void main(String[] args) {

        /*
        Kullanicidan isim ve soyismini ayri ayri alin.
- ismi daha uzun ise, isim ve
soyismi ilk harf buyuk kalanlar kucuk seklinde yazdırın
- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
harflerle yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi yazınız");
        String isim = scan.nextLine();
        System.out.println("soyisminizi yazınız");
        String soyisim = scan.nextLine();
        if (isim.length() > soyisim.length()) {
            char isimch = isim.toUpperCase(Locale.ROOT).charAt(0);
            char soyisimch = soyisim.toUpperCase().charAt(0);
            System.out.println(isimch + isim.replaceFirst("\\w", "") +
                    " " + soyisimch + soyisim.replaceFirst("\\w", ""));
        } else if (soyisim.length() > isim.length()) {
            char isimch = isim.toUpperCase(Locale.ROOT).charAt(0);
            System.out.println(isimch + isim.replaceFirst("\\w", "")
                    + " " + soyisim.toUpperCase());
        }
    }
}