package day31_collections;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {
    public static void main(String[] args) {
        //Deque double ended queue demektir
        //iki yonlu kuyruk
        // bu iki yonlu yapisindan dolayi pek cok method un first ve last versiyonu vardir

        Deque<String> harfler=new LinkedList<>();
        harfler.add("J");
        harfler.add("L");

        System.out.println(harfler);//[J, L]
        harfler.addFirst("B"); // basa ekler
        harfler.addLast("C");//sona ekler
        harfler.addLast("J");
        System.out.println(harfler.removeFirstOccurrence("J"));// ilk kullanimi siler
        System.out.println(harfler);//[B, L, C, J]


        System.out.println(harfler.removeLastOccurrence("T"));//false

       harfler.push("A");// basina ekler

    }
}
