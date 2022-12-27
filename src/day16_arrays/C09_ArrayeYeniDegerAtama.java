package day16_arrays;

import java.util.Arrays;

public class C09_ArrayeYeniDegerAtama {
    public static void main(String[] args) {

        int[] arr1={1,2,3};

       // arr1={3,6,1,8}; // daha uzun veya kisa veya yeni array atamasini yapamayiz
      //  arr1=new int[5];

        System.out.println(Arrays.toString(arr1)); // [0,0,0,0,0]
        // 11.ci satirdaki atama ile java arr1in pointer ini eski arrayden sili
        // new keyword u ile olusturudugumuz yeni arraye yonlendiriir

        //eski elementleride korumak istersek ne yapmaliyiz?
        // ozaman atama yapmadan once yeni arrayi hazirlamaliyiz
        // bunun icin bos bir yeni array olusuturp eski arraydeki elementleri
        // yeni arreye tasiyip sonra aatamayi yapabiliriz


            int[] temp=new int[5];

        for (int i = 0; i < arr1.length ; i++) {
            temp[i]=arr1[i];

        }
        System.out.println(Arrays.toString(arr1));//[1, 2, 3]
        System.out.println(Arrays.toString(temp));//[1, 2, 3, 0, 0]

        arr1=temp;

        System.out.println(Arrays.toString(arr1));//[1, 2, 3, 0, 0]
        System.out.println(Arrays.toString(temp));//[1, 2, 3, 0, 0]


    }
}
