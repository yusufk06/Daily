package day32_sets_maps;

import java.util.Map;

public class C09_NumaraIleSubeGuncelleme {
    public static void main(String[] args) {
        //numarasi verilen ogrencinin sube ismini
        //verilen sube yapan bir method olusturun

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOLustur();

        ogrenciMap=MapMethodDepo.numaraIleSubeDegistirme(ogrenciMap,104, "M");
        System.out.println(ogrenciMap);//104=Ayse-Can-10-M-MF
    }
}
