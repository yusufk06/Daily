package day34_Maps_NestedMaps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C03_MapMethodlari {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOLustur();

        System.out.println(ogrenciMap.containsValue("Ali"));//false
        //value degerinin tamami sorulursa true, bir parcasi sorulursa false der

        ogrenciMap.getOrDefault(103,"Ogrenci bulunamadi");//ogrenci bulunamadi

        System.out.println(ogrenciMap.replace(103, "Ali-Cem-11-K-MF"));
        System.out.println(ogrenciMap.get(103));//Ali-Cem-11-K-MF

        System.out.println(ogrenciMap.replace(123, "Ali-Cem-11-K-MF"));//null

        //put varsa degistirir yoksa ekler
        // replace varsa degstirir yoksa eklemez

        ogrenciMap.replace(103,"Ali-Cem-11-K-MF","Ali-Han-11-K-MF");
        System.out.println(ogrenciMap.get(103));//Ali-Han-11-K-MF
        //kontrol eder, eski value verilen deger ile ayni ise degistrir yoksa degistirmez


    }
}
