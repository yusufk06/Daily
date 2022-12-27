package day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_ForEachLoop {
    public static void main(String[] args) {

        Integer[] arr={2,3,4,5,6,7,7,8,5,4};
        List<Integer> list1=new ArrayList<>();

        //arraydeki tum elementleri liste kopyalayalim

        for (Integer each:arr
             ) {
            list1.add(each);
        }
        System.out.println(list1);//[2, 3, 4, 5, 6, 7, 7, 8, 5, 4]

        // arraydeki cift sayilari olusturacagimiz bir list'e tasiyalim

        List<Integer> ciftSayilarlist=new ArrayList<>();

        for (Integer each:arr
             ) {
            if (each%2==0){
                ciftSayilarlist.add(each);

            }
        }
        System.out.println(ciftSayilarlist);//[2, 4, 6, 8, 4]




    }
}
