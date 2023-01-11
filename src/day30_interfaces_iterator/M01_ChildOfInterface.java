package day30_interfaces_iterator;

import day29_final_abstractClasses.FChild;

public class M01_ChildOfInterface  implements I01_interface, I02_interface {

// bir class baska bir class a extends keyword ile parent edinebilir
    //ancak birden fazla classi parent edinemez
    // interfaceler icin boyle bir sinirlama yoktur bir class istedigi kadar interfaceyi
    //implement edebilir

    public static void main(String[] args) {
        System.out.println(I01_interface.sayi);
        //I02_interface.sayi=25; final oldugu icin sonrdan deger atanamaz
//interfacede olusturulan static veya default olarak isaretlenen methodlarin farki
        //static olana interfaceIsmi.StaticMethodIsmi seklinde ulasilabilirken
        //default olana child class dan olusturulacak obje uzerinden erisilebilir.
        M01_ChildOfInterface obj=new M01_ChildOfInterface();
        obj.method44();
    }
    @Override
    public void method1() {

    }
// eger birden fazla interface implement edildiginde ayni isimde methodlar fsarkli interface;erde
    //varsa return type bakilir ayni ise sorun olmaz farkliyssa CTE olur
    //bu durumda paretn interfacelere mudahale etmek mumkumse mudahale edilebilir
    //veya bu interfacelerden birini implement etmekten vazgecilebilir
    @Override
    public int ethod2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }

    @Override
    public int method6() {
        return 0;
    }
}
