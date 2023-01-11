package day31_collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C06_ArraydekiTekrarlardanKurtulma {
    public static void main(String[] args) {

        //verilen bir arraydeki tekrar eden elementleri
        //sadece 1 kere yazarak arrayi kisaltan bir kod yaziniz

        int [] arr={1,2,4,2,3,5,6,2,4,5,1,2,3,5,4,6,9,6,4,3,2,7,9,6,3,3,3,6,8,9};
        Set<Integer> arr2=new TreeSet<>();

        for (int each:arr) {
            arr2.add(each);
        }
        System.out.println(arr2);//[1, 2, 3, 4, 5, 6, 7, 8, 9]
        //setteki element sayisina esit bir array olusturup
        //setteki elementleri oraya tasiyalim

        arr=new int[arr2.size()]; // [0,0,0,0,0,0,0,0,0]


        int index=0;
        for (int each:arr2) {
            arr[index]=each;
            index++;

        }
        System.out.println("Arrayin son hali : " + Arrays.toString(arr));//Arrayin son hali : [1, 2, 3, 4, 5, 6, 7, 8, 9]
        
            }
        }
