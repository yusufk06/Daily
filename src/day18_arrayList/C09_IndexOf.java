package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C09_IndexOf {
    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        System.out.println(harfler.indexOf("Z"));//1
        harfler.lastIndexOf("Z"); // 1 // z bir kere kullanilmis

        harfler.add("Z");
        System.out.println(harfler);

        System.out.println(harfler.indexOf("Z"));//1
        System.out.println(harfler.lastIndexOf("Z")); // 3
        System.out.println(harfler.indexOf("M")); // -1





    }
}
