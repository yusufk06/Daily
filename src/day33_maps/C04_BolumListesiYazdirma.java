package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C04_BolumListesiYazdirma {
    public static void main(String[] args) {
        // verilen bolumdeki ogrencilerin
        //No, isim, soyisim ve siniflarini yazdiran bir method olusturun


        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOLustur();

        MapMethodDepo.BolumListesiYazdirma(ogrenciMap,"MF");

        /*
        No Isim Soyisim Sinif
        ======================
        101 Ali Can 11
        104 Ayse Can 10
        106 Sevgi Can 10
         */

    }
}
