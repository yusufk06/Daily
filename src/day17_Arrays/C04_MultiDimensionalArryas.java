package day17_Arrays;

import java.util.Arrays;

public class C04_MultiDimensionalArryas {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4,5,},{6,7,4,5}, {2},{1,2,3,4,5}};

        System.out.println(arr.length); // 5
        System.out.println(arr[2].length); //4 {6,7,4,5}

        System.out.println(arr[2][1]); // 7 {6,7,4,5}

        System.out.println(arr[3]); // referans degeri
        //Multi dimensional array ile calisirken dikkat etmemmiz gereken en onemli
        // konu yazdigimiz kodun bir array mi yoksa yazdirabilecegimiz bir element mi dondurdugudur

        System.out.println(Arrays.toString(arr[3])); //[2] bu bir array

        //21.satirdaki 2 elementini yazdirmak istersek
        System.out.println(arr[3][0]); //2  bu bir element


        //MDA in tumunu yazdirmak isterseniz
        // tek katli arrayleri yazdirmak icin kullandigimiz yonterm yeterli olaz

        System.out.println(Arrays.toString(arr)); //[[I@28a418fc, [I@5305068a, [I@1f32e575, [I@2f92e0f4, [I@279f2327]

        System.out.println(Arrays.deepToString(arr)); //[[1, 2], [3, 4, 5], [6, 7, 4, 5], [2], [1, 2, 3, 4, 5]]


    }
}
