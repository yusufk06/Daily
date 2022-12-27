package uygulama;

import java.util.Scanner;

public class C15_Soru2 {
    public static void main(String[] args) {
        /*
        Kullanicidan alinan bir String alin,
         String’in uzunlugu cift sayi ise tam ortasina
:) ekleyin, String’in uzunlugu tek sayi ise
 ortadaki harfi silin ve yerine :(
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir yazı yazınız");
        String str = scan.nextLine();
        if (str.length() % 2 == 0) {
            System.out.println(str.substring(0, str.length() / 2) + ":)" +
                    str.substring((str.length() / 2)));
        } else if (str.length() % 2 != 0) {
            str = str.replace(str.charAt(str.length() / 2), '5');
            str = str.replaceAll("\\d", ":(");
            System.out.println(str);
        }
    }
}