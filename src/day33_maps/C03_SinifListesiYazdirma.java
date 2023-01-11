package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C03_SinifListesiYazdirma {

    public static void main(String[] args) {

        //verilen siniftaki ogrencilerin no, isim, soyisim, bolumlerini bir liste olarak yazdiran
        //bir method olusturun
        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOLustur();


        MapMethodDepo.sinifListesiYazdirma(ogrenciMap,"10");

        /*
            No Isim Soyisim Bolum
            ======================
            102 Veli Cem K
            104 Ayse Can H
            106 Sevgi Can K

         */






    }
}
