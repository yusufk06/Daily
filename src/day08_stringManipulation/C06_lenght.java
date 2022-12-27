package day08_stringManipulation;

import java.util.Random;

public class C06_lenght {
    public static void main(String[] args) {

        String str="Java her gecen gun daha da guzellesiyor";
        //sondan 3. karakteri yazdirin
        System.out.println(str.charAt(str.length()-3)); // y
        System.out.println(str.length()); // kac karakter oldugunu gosteriyor 50

        //rastgele bir karakterini yazdiralim

        Random rnd=new Random(); // rnd degeri icin 0 ile 1 arasinda rastgele bir deger olusturur
        int index =rnd.nextInt(str.length());  //str.lengthden kucuk rastgele bir int uretor
        System.out.println(str.charAt(index));

    }
}
