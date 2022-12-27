package day16_arrays;

import java.util.Arrays;

public class C04_Soru2 {
    public static void main(String[] args) {

        //verilen bir String array de
        //istenen bir harfi iceren kelimeleri silip. yerine null yazdrin.

        String[] isimler= {"Huseyin", "Yusuf", "Mehmet", "Akile", "Said"};
        String silinecekHarf="u";

        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].contains(silinecekHarf)){
                isimler[i]=null;
            }
        }
        System.out.println(Arrays.toString(isimler)); //[null, null, Mehmet, Akile, Said]

    }
}
