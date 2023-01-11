package day32_sets_maps;

import java.util.HashSet;
import java.util.Set;

public class C02_HashSetMethodlari {
    public static void main(String[] args) {

        Set<String> set1= new HashSet<>();
        set1.add("Ali");
        set1.add("Ramazan");
        set1.add(null);
        set1.add("Elif");

        System.out.println(set1);//[null, Elif, Ramazan, Ali]

        set1.add(null);// eskisiini siler yenisini yazar 2 tane olmaz



    }
}
