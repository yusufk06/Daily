package day31_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList {
    public static void main(String[] args) {
        //List data turunde bir linkedList olusturalim


        List<String> harfler=new LinkedList<>();

        harfler.add("H");
        harfler.add("K");

        System.out.println(harfler); // [H, K]

        harfler.add("H");
        System.out.println(harfler); // [H, K, H]

        // 1. index e m ekleyelim

        harfler.add(1, "M");

        //2. indexdeki k yi l yapalim

        harfler.set(2, "L");

        List<String> karakterler=new LinkedList<>();

        karakterler.add("*");
        karakterler.add("#");
        karakterler.add("9");
        karakterler.add(2,"M");

        System.out.println(karakterler);//[*, #, M, 9]

        System.out.println(harfler.retainAll(karakterler));//true
        System.out.println(harfler);//[M] // ortak elementler disindaki herseyi sildi

        harfler.addAll(karakterler);
        System.out.println(harfler);//[M, *, #, M, 9]

        System.out.println(karakterler.subList(1, 3));//[#, M]
        System.out.println(karakterler);//[*, #, M, 9]
        System.out.println(karakterler.hashCode());//2210822


    }

}

