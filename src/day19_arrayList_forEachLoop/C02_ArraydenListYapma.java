package day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArraydenListYapma {
    public static void main(String[] args) {

        Integer[] arr={2,3,4,5,6,7,7,8,5,4};

        /*
        verilen bir arrayi liste cevirmek icin 2 yontem vardi
        1- bir loop ile tum elementleri Liste kopyalamak
        2-asList() kullanmak
        cok tavsiye etmiyoruz cunku 2 buyuk dezavantaji var
        - asList ile olusturulan list, arrayden donusturuldugu icin
        add, remove gibi size'i degistiren methodlar kullanilamaz
        -asList() ile olusturulan list ile bagli oldugu array
        birbirinden ayrilmiyor
        birinde yapacagimiz degisiklik otomatik olarak digerinide etkiliyor


         */


        List<Integer> list1=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list1.add(arr[i]);
        }
        System.out.println("loop ile tasinan list:" + list1);



        List<Integer> list2= Arrays.asList(arr);
        System.out.println("asList ile olusturulan list :" + list2);

        //list2.add(6); // hata verir

        arr[0]=10;
        System.out.println(Arrays.toString(arr)); //[10, 3, 4, 5, 6, 7, 7, 8, 5, 4]

        System.out.println(list2);//[10, 3, 4, 5, 6, 7, 7, 8, 5, 4]

    }
}
