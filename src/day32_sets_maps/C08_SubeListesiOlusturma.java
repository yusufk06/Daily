package day32_sets_maps;

import java.util.Map;

public class C08_SubeListesiOlusturma {
    public static void main(String[] args) {
        //verilen sinif ve sube ismi ile sinif listesini yazdiran method olusturun

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOLustur();

        MapMethodDepo.subeListesiYazdirma(ogrenciMap,"11", "H");

        //Ismi  Soyisim
        //Ali  Can
    }
}
