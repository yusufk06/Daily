package day15_scope_Arrays;

public class C03_BaskaClassaErisme {
    public static void main(String[] args) {

        /*
        java OOP konsept cercevesinde baska classlardaki class uyelerini (variable/method)
        kullanabiliriz Baska class daki herhangi bir class uyesine ersimek istedigimizde
        static keyword onemli bir royl oynar

        static olarak isaretlenen class uyelerine
        classIsmi.staticuyeIsmi seklinde ulasabiliri

        static olmayan class uyelerine erisebilmek icin obje olusturmamiz gerekir

        Java runtime program dir
        basinca calisir calistigi surece yapilan islemleri KALICI olarak tutar
        calisma bittiginde HER SEY YOK OLUR
         */
        System.out.println(C01_Hastane.hastaneadresi); // Cankaya/Ankara

        C01_Hastane.method1(); //Cankaya/Ankara
        System.out.println(C01_Hastane.hastaneismi);//Yildiz Hastanesi

        C01_Hastane per1= new C01_Hastane(); // obje olusturup static olmayanlari kullaniyorz
        System.out.println(per1.personelAdresi); // null
        System.out.println(per1.hastaneismi); // Yildiz Hastanesi

        per1.personelIsmi="belkis"; // atamada yapabilirz

        System.out.println(per1.personelIsmi); // belkis



    }
}
