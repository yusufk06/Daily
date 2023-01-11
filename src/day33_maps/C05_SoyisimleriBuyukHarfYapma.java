package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C05_SoyisimleriBuyukHarfYapma {

    public static void main(String[] args) {

        //Map deki soyisimleri buyuk harfe ceviren biir method olusturun

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOLustur();

        ogrenciMap=MapMethodDepo.soyisimleriBuyukHarfYap(ogrenciMap);

        MapMethodDepo.tumListeYazdir(ogrenciMap);
        /*
        No   Ogrenci Bilgileri
=======================
101=Ali-CAN-11-H-MF
102=Veli-CEM-10-K-TM
103=Ali-CEM-11-K-TM
104=Ayse-CAN-10-H-MF
105=Sevgi-CEM-11-M-TM
106=Sevgi-CAN-10-K-MF
         */

        //11. siniflari yazdiralim

        MapMethodDepo.sinifListesiYazdirma(ogrenciMap,"11");


    }
}
