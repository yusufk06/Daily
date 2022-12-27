package day13_methodOverloading;

public class C03_MethodOverloading {
    public static void main(String[] args) {

        toplama(5.4,6.3); //11.7
        toplama('a','b');//

        //ilk olarak %100 uyumlu parametreler arar
        // %100 uymlu yoksa calisabilecek method varmi diye kontrol eder
        // calisacak method birden fazla olursa, monimum casting yaparak kullanabilecegini
        //tercih eder

        toplama(8.4,6);// siralama onemlidir o yuzden ilk double olani kullanir
        // double sayi, double sayi2

    }




    public static void toplama (int sayi2, double sayi1){
        System.out.println("int ve double  toplami :" +(sayi1+sayi2));
    }
    public  static void toplama(double sayi1, double sayi2){
        System.out.println("double ve double  toplami :" +(sayi1+sayi2));
    }

}
