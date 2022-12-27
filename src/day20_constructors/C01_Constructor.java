package day20_constructors;

import day19_arrayList_forEachLoop.Toyota;

public class C01_Constructor {

    public static void main(String[] args) {

        Car car1=new Car();
        Toyota toyota=new Toyota();

        System.out.println(car1);
//Car{marka='Marka belirtilmemis', model='Model belirtilmemis', yil=1900, km=0, renk='Renk secilmedi'}
        System.out.println(toyota);
        //day19_arrayList_forEachLoop.Toyota@19469ea2
        // toyota bir obje oldugundan ozelliklerini direkt YAZDIRAMAYIZ. referansi yazdirir

        //bir classdan olusturulan objelerin belirli ozelliklerini kolayca yazdirabilmek
        //icn o class da istenen ozellikleri kapsayan bir toString () olusturulabilir

        /*
        toString methodundaki yazilanlari istedigimiz sekil ve formata uyarlayabiilirz
        Car{marka='Marka belirtilmemis'
, model='Model belirtilmemis'
, yil=1900
, km=0
, renk='Renk secilmedi'}

         */
        car1.marka="Audi";
        car1.model="A4";
        car1.yil=2020;
        car1.km=20000;
        car1.renk="Siyah";

        System.out.println(car1);
        /*
        Car{marka='Audi'
, model='A4'
, yil=2020
, km=20000
, renk='Siyah'}
         */





    }
}
