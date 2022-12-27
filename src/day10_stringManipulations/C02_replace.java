package day10_stringManipulations;

public class C02_replace {
    public static void main(String[] args) {

        String str= " Java ogren, adana ye :)";
        System.out.println(str.replace('a', 'A'));// JAvA ogren, AdAnA ye :)
        System.out.println(str.replace("java", "Yazilim"));//yazilim ogren dadana ye
        String telefon="555 3451234";
        System.out.println(telefon.replace("555", "532"));
        System.out.println(telefon.replace('3', '7'));


        //asagidaki arama sonucunun 10 binden fazla oldgunu test edin
        String sonuc="1-16 of over 100,000 results for \"apple\"";

        int indexOver=sonuc.indexOf("over");
        int indexResults=sonuc.indexOf("results");

        String sonucSayisistr=sonuc.substring(indexOver+5, indexResults-1);
        sonucSayisistr=sonucSayisistr.replace(",", "");

        int sonucSayisiInt=Integer.parseInt(sonucSayisistr);

        if (sonucSayisiInt>10000) {
            System.out.println("arama sonuc testi PASSED");
        }else System.out.println("arama sayisi yetersiz FAILED");


    }
}
