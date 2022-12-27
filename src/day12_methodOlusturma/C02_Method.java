package day12_methodOlusturma;

public class C02_Method {
    public static void main(String[] args) {

      // verilen 2 sayiyi carpip sonucu yazdiran bir method olustun
    // bir method ancak method call yapildiginda calisir
        //method call icin method adi ve parametrelere uygun argument yazilmalidir
        //method call icersinde yazilan degerlere veya  variable argument denir

     carpYazdir(5,8); //40.0
     carpYazdir(7.4,8.6); //63.64

        //carpYadir("ali" , "veli"); argument ve parmetreler uyumlu degilse cte olur
    }

    public static  void carpYazdir (double sayi1, double sayi2){
        System.out.println(sayi1 * sayi2);
    }
}
