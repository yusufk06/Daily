package day09_stringManipulation;

public class C08_lastIndex {
    public static void main(String[] args) {

        String str= "Javayi iyi ogrenmek icin cok calismam lazim cok.";
    //ilk anin indexini yazdiralim
        System.out.println(str.indexOf("a")); //1

        //son anin indexini yazdirin

        System.out.println(str.lastIndexOf("a")); //39

        //verilen str da cok kelimesinin kullanumini kontrol edip
        //- cok kelimesi kullanilmamis
        // -bir kere kullanilmi
        //- birden fazla kullanilmis
        // soonuclarindan uygun olani yazdirin
       // String str= "Javayi iyi ogrenmek icin cok calismam lazim cok.";

        int ilkCokIndexi=str.indexOf("cok");
        int sonCokIndexi=str.lastIndexOf("cok");

        
       if (!str.contains("cok")) {
           System.out.println("cok kelimesi kullanilmamis");
       }else if (ilkCokIndexi==sonCokIndexi) {
           System.out.println("cok kelimesi bir kere kullanilmis");
       }
       else {
           System.out.println("cok kelimesi birden fazla kullanilmis");



       }

    }
}
