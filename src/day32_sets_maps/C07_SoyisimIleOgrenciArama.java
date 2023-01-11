package day32_sets_maps;

import java.util.Map;

public class C07_SoyisimIleOgrenciArama {

    //ogrenci map de aradigimiz soyisim'deki ogrencilerin
    //isim,soyisim sinif ve sube bilgilerini
    // bir tablo olarak yazdiran bir method olusturun

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOLustur();


        MapMethodDepo.soyisimIleOgrenciListesiYazdirma(ogrenciMap,"Can");

        /*
        Isim Soyisim Sinif Sube
        Ali Can 11 H
        Ayse Can 10 H
        Sevgi Can 10 K
         */
    }



}
