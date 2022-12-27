package day08_stringManipulation;

public class C07_substring {
    public static void main(String[] args) {

        String str= "Java ogren, isi kap";
        System.out.println(str.length()); // karakter sayisi

        // metnin tam ortasinda ki karakter nedir ?

        System.out.println(str.charAt(str.length()/2)); //ortadaki karakter n

        // son karakteri yazdirin
        System.out.println(str.charAt(str.length()-1)); // p

        //bir karakteri degil de verilen Stringin icerdigi bir metin parcasini elde etmek
        //istersek

        // mesela 'ogren' kelimesini yazdiralim

        System.out.println( str.substring(5, 9)); //tek tek saymali 5 ve 9u
    // substring (bas,bitis) methodunda
        //baslangic olarak yazilan index dahil (inclusive)
        //bitis olarak yazilan index haric (exclusive)dir o yuzden ogre yazdi
        //ogren icin
        System.out.println( str.substring(5, 10));

        // strdan "Java" kelimesiini yazdiralim

        System.out.println( str.substring(0, 4));

        //strdan "kap" yazdiralim

        System.out.println( str.substring(16, 19));
        System.out.println(str.substring(16));//
        System.out.println(str.substring(str.length()-3));

        //substring kullanarak sadece J harfini yazdirin

        System.out.println(str.substring(0,1));

        //substring kullanarak 9. indedeki harfi buyuk olarak yazdirin

        System.out.println(str.toUpperCase().substring(9,10)); // N burda hala string deyiz
        System.out.println(str.toUpperCase().charAt(9)); // N
        //charAt() kullanmak yerine subtring kullanmak daha avantajli olabilir
        //cunku sunstring kullaninca ifade hala string oldugundan
        //method kullanmaya devam edebiliriz

        System.out.println(str.substring(5,5));//  hiclik olur konsolda bos bir satir olur
        System.out.println("======");

       // System.out.println(str.substring(4,3));  //hata verir

       // System.out.println(str.substring(25,28)); // hata verir o kadar index olmadigi icj
        System.out.println(str.substring(str.length()));// bos satir verir
        //19 index yok 18 var 0dan basladigi icin

        System.out.println(str.substring(str.length()+1));
        //hata verir cunku o kadar index yok

        System.out.println(str.substring(0, str.length()-3));
        //bastan basalayi son 3 haric









    }
}
