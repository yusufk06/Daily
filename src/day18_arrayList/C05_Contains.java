package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_Contains {
    public static void main(String[] args) {
        int[] arr={4,3,6,7,3,5,6,7,3,5,4,6,4,7,7,7};// arraye element eklemek kolay


        List<Integer> sayilar=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }

        System.out.println(sayilar); //[4, 3, 6, 7, 3, 5, 6, 7, 3, 5, 4, 6, 4, 7, 7, 7]

        System.out.println(sayilar.contains(3)); // true
        System.out.println(sayilar.contains(8)); // false



    }
}
