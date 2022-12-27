package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Size {
    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();

        sayilar.add(10);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(9);

        System.out.println(sayilar.size()); // 4
        System.out.println(sayilar.isEmpty()); // suan dolu oldugu icn false
        System.out.println(sayilar.contains(8)); // false cunku yok
        sayilar.clear(); // Listedeki tum elementleri siler
        System.out.println(sayilar.size()); // ustte sildigimiz icin 0 yazar
        System.out.println(sayilar);//[] listeyi silmkyor icini temizliyor

        System.out.println(sayilar.isEmpty()); // bos oldugu icin true




    }
}
