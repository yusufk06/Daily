package day12_methodOlusturma;

public class C08_Palindrome {
    public static void main(String[] args) {
        //verilen bir Stringin palindrome olup olmadigini yazdirin
        //duz okunusu ile tersten okunusu birbirine ayni olan

        String str="1234321";

        String tersStr= C07_TerseCevirme.metniTerseCevir(str);
        if (str.equals(tersStr)){
            System.out.println("verilen metin palindrome");
        } else {
            System.out.println("verilen metin palindrome degil");
        }


    }
}
