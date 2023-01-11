package day30_interfaces_iterator;

public interface I01_interface {

    //interface lerde tum methodlar public ve abstract tir ozellikle yazmaya gerek yok

    int sayi=10;
    public static final String okulIsmi="Yildiz Koleji";
    //public int sayi2;
    //interfacelerde tum variableler public static  ve final dir o yuzden sonradan deger atama olmazz
    void  method1();
    public int ethod2();
    abstract String method3();
    public abstract void method4();

    void method5();
    /*
    bir interface e sonradan bir method eklemek istedigimizde o interfaceyi daha once
    implement eden tum calsslar yeni eklenen methodu implement etmek zorunda olur.

    Java ya yapian talepler sonucunda java 8 ile birlikte bu konuda bir istisna getirilmistir
    eger sonradan eklenen methodun tum eski classlar tarafindan implement edilme mecburiyeti
    olmasin istiyorsaniz yeni olusturdugunuz methoda DEFAULT veya STATIC keyword ekleyip body
    de olusturursaniz ozaman bu methodun child classlar tarafindan implement edolme MECBURIYETI olmaz

     */
    public default void method44(){
        System.out.println("interface deki default olarak isaretlenen method calisti");

    }
    public static void method34(){
        System.out.println("interfacedeki static olarak isaretlenen method calisti");
    }
}
