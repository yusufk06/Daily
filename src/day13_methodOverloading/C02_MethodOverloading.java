package day13_methodOverloading;

public class C02_MethodOverloading {
    public static void main(String[] args) {

        String str="Java cok guzel";
        System.out.println(str.substring(5)); // cok guzel
        System.out.println(str.substring(3, 5));

        //eger sectigimiz isimde birden fazla method varsa buna overloading denir.
        // ve ayni isimdeki methodlardan hangisinin calisacagina argument/parametre
        // uyumu karar verir



toplama(5,6); //11
  toplama(4,5,6);   //15

// java  ayni class iverisinde aynni isim ve ayni data turunden parametre sayisi ile
        // 2 method olusturmaniza izin vermez
        //1-ismini degistirebilir ancak bu durumda overloading olmaz
        //overloading ayni isimde ama farkli isleve sahip methodlar demektir
        //2- parametre sayisini degistirebilirz int sayi1 , sayi2, sayi3 gibi
        //3- ayni sayida parametre yazip parametrelerin data turunu degistirebiliriz
        //veya farkli data turundeki parametrelerin yerini degistirebilirz



    }
public  static void toplama(int sayi1, int sayi2 ){
    System.out.println("2 tamsayinin toplami :" +(sayi1+sayi2));

}
public static void toplama(int sayi1 , int sayi2, int sayi3){
    System.out.println(" 3 tamsayinin toplami :" +(sayi1+sayi2+sayi3));
}

public  static void toplama(double sayi1, int sayi2){
    System.out.println("double ve int  toplami :" +(sayi1+sayi2));
}

public static void toplama (int sayi2, double sayi1){
    System.out.println("int ve double  toplami :" +(sayi1+sayi2));
}
public  static void toplama(double sayi1, double sayi2){
    System.out.println("double ve double  toplami :" +(sayi1+sayi2));
}


}
