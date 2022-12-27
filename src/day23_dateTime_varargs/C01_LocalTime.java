package day23_dateTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime zaman=LocalTime.now();
        System.out.println(zaman);//12:07:00.714427

        System.out.println(zaman.getMinute());//12:07:47.334033 // 7
        System.out.println(zaman.withSecond(0).withNano(0));//12:08
        System.out.println(zaman.withSecond(1).withNano(1));//12:09:01.000000001
        System.out.println(zaman.plusHours(100).plusMinutes(250));//20:20:27.075809

        //bir for loop ile 1 den  10000e kadar olan sayilari yanyana yazdirin
        //bu islem icin gecen zamani bulun

        LocalTime basZamani=LocalTime.now();
        System.out.println("baslangic "+basZamani);
        for (int i = 1; i <10000 ; i++) {
            System.out.print(i+ " ");

        }
        LocalTime bitZamani=LocalTime.now();
        System.out.println("");
        System.out.println(bitZamani);
        System.out.println("islem suresi : " + (bitZamani.getNano()-basZamani.getNano()));
        //islem suresi : 103579000

        /*
        olusturdugumuz time veya date guncel zamani veya tarihi tutmaya devam eden bir sayac
        degil olusturdugumuz satirdaki zamani veya tarihi sistemden alip kaydeden bir variabledir
        ilerleyen satirlarda guncel zaman veya tarihe ihtiyacimiz oldugunda yeni bir time veya date objesi
        olusturup o andaki degeri alabiliriz.
         */




    }
}
