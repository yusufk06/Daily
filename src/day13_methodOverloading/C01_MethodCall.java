package day13_methodOverloading;

import day12_methodOlusturma.C03_AsalSayi;
import day12_methodOlusturma.C07_TerseCevirme;
import day12_methodOlusturma.C07_TerseCevirme;
import day12_methodOlusturma.C09_FibonacciSerisi;

public class C01_MethodCall {
    public static void main(String[] args) {

        // ilk 15 fibonacci sayisini yazdirin

        C09_FibonacciSerisi.fibonaccidenSayiYazdir(15);
        //0 1 1 2 3 5 8 13 21 34 55 89 144 233 377

        //asagida verilen cumleyi tersine cevirin
        String str="Bir kere yaparim, yan gelir yatarim";
        System.out.println(C07_TerseCevirme.metniTerseCevir(str));
        //miratay rileg nay ,mirapay erek riB

        String tersStr;
        // asagida verilen cumlenin palindrome olup olmadigini yazdirin
        str="Java Candir";
        tersStr= C07_TerseCevirme.metniTerseCevir(str);
        if (str.equals(tersStr)){
            System.out.println("palindrome");
        }else System.out.println("palindrome degil");

        //asagida verilen sayinin asal sayi olup olmadigini yazdirin
        int sayi=23;
        System.out.println(C03_AsalSayi.asalSayiMi(sayi));//true
        //kullanici true / falseden bir sey anlamaz , acik sekilde yazalim dersek
        boolean sonuc=C03_AsalSayi.asalSayiMi(sayi); // true
        if (sonuc) {
            System.out.println("Girilen " + sayi + " asal,");
        }else System.out.println("girilen" + sayi + " asal degil");




    }
}
