package day16_arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {


        String[] arr1=new String[4]; // [null, null, null, null]

        int[] arr2 = {3,4,5,6,7,8};

        System.out.println(arr2[2]); //5
        System.out.println(arr1[3]); // null

        System.out.println(arr1[8]); //out of bounds hatasi

        arr2[2]=15; // deger 5 di 15 oldu
        arr2[0]=7;
        //tum arrayi yazdiralim
        System.out.println(arr2); //referans yazdirir
        //Array in tamamini yazdirmak isterseniz, arrays classindan yardim almalisinjz

        System.out.println(Arrays.toString(arr2)); // sayilari verir [7, 4, 15, 6, 7, 8]

        System.out.println(Arrays.toString(arr1)); //[null, null, null, null]


    }
}
