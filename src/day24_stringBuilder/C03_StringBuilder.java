package day24_stringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";

        System.out.println(sb1 == sb2);// false
        System.out.println(sb1.equals(sb2));//false
        // StringBuilder metin  esitligi sorgulamak icin equals() kullanmaz
        System.out.println(sb1.compareTo(sb2)); // 0 esittir

        StringBuilder sb3 = new StringBuilder("Hava");
        System.out.println(sb1.compareTo(sb3));//2
        sb3 = new StringBuilder("Tava");
        System.out.println(sb1.compareTo(sb3));//-10
        // t ile j arasinda kac harf oldugunu terse gittigi icin -ile yaziyor
        sb3 = new StringBuilder("Jaka");//
        System.out.println(sb1.compareTo(sb3));//11

        sb3 = new StringBuilder("Javax");
        System.out.println(sb1.compareTo(sb3));//-1

        sb3 = new StringBuilder("Java Candir");
        System.out.println(sb1.compareTo(sb3));//-7



        // System.out.println(sb1==str); data turleri farkli cte verir

        System.out.println(sb1.equals(str));//false

        //System.out.println(sb1.compareTo(str)); // compareto strinbuilderlar arasinda calisir
            //farkli data turu kabul etmez





    }
}