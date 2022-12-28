package day24_stringBuilder;

public class C04_AccessModifier {

    String str;
    // Access modifier i gozlerimizle goremiyorsak
    // default access modifier var demektir

    // bu class da default constructor var
    //strin degeri nulldir (default deger)
    //strin access modifier i default access modifier



    public static void main(String[] args) {

        D obj1=new D();
        System.out.println(obj1.isimDefault); //Furkan
        obj1.defaultStaticOlmayanMethod();//default access modifier li static olmayan methpd calisti

        //baska class lardaki class uyelerine erisimde
       // access modifier ve static keyword u dikkate alinmalidir
        //static class uyelerini obje uzerindan kullanmaya gerek yoktur
        //cilla da obje uzerinden kullanmak isterseniz
        //clas uyesinin ismini yazmaniz gerekir

        System.out.println(obj1.isimDefaultStatic); // Sevilay
        System.out.println(D.isimDefaultStatic);// Sevilay
        D.isimDefaultStatic="Mehmet";
        obj1.defaultStaticMethod();
        D.defaultStaticMethod();
        // default access modifier'li static method calisti


    }
}
