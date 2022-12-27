package day15_scope_Arrays;

import day14_doWhileLoop_scope.Hastane;

public class C01_Hastane {
    static String hastaneismi = "Yildiz Hastanesi";
    static String hastaneadresi = "Cankaya/Ankara";


    String personelIsmi;
    String personelAdresi;
    String personelTel;

    public static void main(String[] args) {

        // eger tum methodlardan kullanilabilecek variable lar olusturmak isterseniz
        //bu varibleleri class levelda olustururuz
        // class level da olusturulacak variable lar icin 2 ihtimal vardir
        //1- statik variable ( class variable)
        //2-  instance (static olmayan) variable ( obje variable)

        // kural1 static variableler tum objeler icin tek bir deger alir
                // insatance variablelar her obje icin java tarafindan cogaltilir
        //kural 2 class level variablelarar deger atmasak da kullanabiliriz
                // biz deger atamasask bile java class level variableleara default degerler atar
        //non-primitive==> null(String)
        //sayisal primitive==> 0
        // char ==> '' (hiclik)
        // boolean==>false

        //kural3 static olan methodlardan static olmayan variable  ve methodlara direk ulasilmaz
                    //instance variable ve static olmayan methodlari static alanlardan kullanmak
        //isterseniz obje uzerinden kullanabilirsiniz.
        //kural4 class da olusturulan instance variable lar elk deger atamasini yapar
        // yani bir obje ilk olusturuldugunda otomatik olarak instance variable a atanan degeri alir
        // deger atanmamissa default degerleri alir
        //obje olusuturulduktan sonra obje uzerinden yapilan atamalar class level daki instance varibleye
        //degil java tarafindan olusturulup objeye yapistirilan kopya variable lara yapilir


        //kural 5 static variable lar  tum objeler icin ortaktir.
                // static variable lara tum classdan direk ulasilabilir
        //static variable in deger degisirse tum objeler icin degismis olur

        C01_Hastane per1= new C01_Hastane();
        System.out.println(per1.personelIsmi); // null
        System.out.println(per1.personelAdresi); // null
        System.out.println(per1.personelTel); // null

        per1.personelIsmi="fidan";
        per1.personelAdresi="germany";
        per1.personelTel="5676767";








    }

    public static void method1(){
        System.out.println(hastaneadresi);
    } // ister static olsun ister olmasin tum classdan ulasilabilir

    public void  method2 (){
        System.out.println(hastaneismi);
    }
}