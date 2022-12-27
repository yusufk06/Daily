package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_Set {
    public static void main(String[] args) {
        // javada bir cok yapida get ve set methotlari bulunur
        // get methodlari bilgiyi bize getirirken
        // set methodlari bilgiyi update eder

        List<String> harfler = new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        // 2. indexe F elemeanini ekleyin
        // add methodu var olan listeden herahgni bir elementi degistrmeden
        //istedigimiz elementi ekler kalanlari kaydirir

        harfler.add(2,"F");
        System.out.println(harfler); //[A, Z, F, T]

        harfler.set(2,"M");
        System.out.println(harfler); //[A, Z, M, T]
        // set ordaki indexi gunceller f yi m yapar
        /// eleman sayisini artirmaz


    }
}
