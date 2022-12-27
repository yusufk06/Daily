package day10_stringManipulations;

public class C01_NullPointer {
    public static void main(String[] args) {
        String str1="";
        String str2="   ";
        String str3;
        String str4=null;

        System.out.println(str1.length()); //0
        System.out.println(str2.length());// 4

        System.out.println(str1.isEmpty()); // true
        System.out.println(str2.isEmpty()); // false

        System.out.println(str1.isBlank()); // true
        System.out.println(str2.isBlank());// true

        // null bir deger degil isaretcidir.(null pointer)
        // null pointer : non primitive bir objenin olusturuldugunu
        //              ancak bilincli olarak deger atanmadigini isaretler
        // str4un degeri nulldir cumlesi yanlis
        //  str4 null olarak isaetlenmis dogru

       // System.out.println(str3.length());
       // System.out.println(str3.concat("Ali Can"));
       // System.out.println(str3.substring(3, 4));
            //java bir variablei olusturup deger atamanmamasina izin verir
        // bir variablei deger atamadan olusturabilirsiniz ancak kullanamazsiniz
        //deger ataanmayan bir variableyi kullanmaya kalkarsaniz java cte verir.

    //str4 null oldugu icin itirazz etmez
        //System.out.println(str4.length());// calistirinca hata verir
        System.out.println(str4.concat("Ali Can"));
        System.out.println(str4.substring(3, 4));
// null pointer isebu variable a bir deger atanmadigini
        // ve bunun bilinbli bir tercih oldugunu javaya soyler// dolayisiyla java kodalarin calismaya devam etmesin izin verir
        //ancak deger atanmadigi icin methodlarla kullanmaya calisirsaniz
        //nullpointerexception  hatasi verir

        System.out.println(str4);// yazdirinca null yazar
        System.out.println(str4 + "Ali Can");//nullAli Can yazar
        System.out.println(str4.concat("ali can")); // nullpointerexception


    }
}
