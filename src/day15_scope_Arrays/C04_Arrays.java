package day15_scope_Arrays;

public class C04_Arrays {

    public static void main(String[] args) {


         int [] arr= {1,2,3}; // ustteki yazim daha uygun
         int arr2[]={4,5,6,7,8,9}; // bu sekilde yazildiginda kac element yazildi ise onu
        // lenght olarak kabul eder


         String[] harfler=new String[400];

        System.out.println(arr.length); // 3

        // String de kullandigimiz harfler.lenght() bir method iken
        //arrrayde ki lenght method degil variabledir arr.lenght 

    }
}
