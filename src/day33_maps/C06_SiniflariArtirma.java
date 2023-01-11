package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C06_SiniflariArtirma {
    public static void main(String[] args) {

        // ogrenci map indeki tum sinif degerlerini 1 artirin
        //12.sinifta olan varsa sinif bilgisini Mezun yapin

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOLustur();

        ogrenciMap=MapMethodDepo.siniflariArtir(ogrenciMap);
        MapMethodDepo.tumListeYazdir(ogrenciMap);
        /*
        No   Ogrenci Bilgileri
=======================
101=Ali-Can-12-H-MF
102=Veli-Cem-11-K-TM
103=Ali-Cem-12-K-TM
104=Ayse-Can-11-H-MF
105=Sevgi-Cem-12-M-TM
106=Sevgi-Can-11-K-MF

         */

    }
}
