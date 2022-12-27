package day17_Arrays;

import java.util.Arrays;

public class C02_Equals {
    public static void main(String[] args) {


        int[] arr1={3, 8, 0};
        int[] arr2={8, 3, 0};
        System.out.println(Arrays.equals(arr1, arr2)); // false

        //equals methodu hem elementleri hem de indexleri kontrol eder
        // ayni indexlerde ayni elementler varsa true yoksa false doner


        //efer sralamadan dolayi false donmesini istemiyorsaniz
        // once iki arrayi de sort yapip siralayip sonra equals uygulariz
        Arrays.sort(arr1); //[0, 3, 8]
        Arrays.sort(arr2); // [0, 3, 8]
        System.out.println(Arrays.equals(arr1, arr2)); // true


    }
}
