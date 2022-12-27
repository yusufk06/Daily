package day18_arrayList;

import day16_arrays.C10_BirElementEkleme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {

    public static void main(String[] args) {

        String[] arr={"A","B","T"};
     arr=   C10_BirElementEkleme.C10_ArrayeBirElementEkleme.arrayeElementEkleme(arr,"C");

        System.out.println(Arrays.toString(arr)); //[A, B, T, C]

        // ArrayList esnek uzunluktaki bir arraydir
        //ancak ArrayList, array altyapisini kullandigindan elementleri sadece tek tek ekleyebilirz


        List <String> harfler=new ArrayList<>();
        System.out.println(harfler); // []
        harfler.add("A");
        harfler.add("B");
        harfler.add("K");

        System.out.println(harfler);//[A, B, K]
        // istedigimiz kadar element ekleyebiliriz
        harfler.add(1,"C");
        System.out.println(harfler); //[A, C, B, K] b ile k arasinda d ekleyelim asagiya
        harfler.add(3,"D");
        System.out.println(harfler);//[A, C, B, D, K]



        List<String> karakterler= new ArrayList<>();
        karakterler.add("*");
        karakterler.add("#");

        harfler.addAll(karakterler);
        System.out.println(harfler);//[A, C, B, D, K, *, #]

        harfler.addAll(2,karakterler);
        System.out.println(harfler); //[A, C, *, #, B, D, K, *, #]






    }
}
