package day28_exceptions;

import java.util.Scanner;

public class C05_MultipleExceptions {
    public static void main(String[] args) {
//eger birden fazla exception olusma ihtimali varsa bu exc.lar birbirinden bagimzsizsa
        //1- tek try istenen kdar catch yapilabilir
        //2-ikisi icin ic ice try catch yapabilirz
        //3- iki exc. da kapsayan tek bir carth yapilabilir

        String str="Java'da cok fazla exception var";
        int[] arr={3,5,1,3,4,5,7,8,5};

        //kulanicidan bir tamsayi alin
        //ve girilen sayiyi index olarak kullanip
        //str ve arr den o indexdeki elementleri yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir index girin");
        int index= scan.nextInt();
       // System.out.println("String'den istenen index'deki element : " + str.substring(index,index+1));
       // System.out.println("Arrayden istenen indexdeki element : " + arr[index]);

        /*
        //1. cozum
        try{
            System.out.println("String'den istenen index'deki element : " + str.substring(index,index+1));
            System.out.println("Arrayden istenen indexdeki element : " + arr[index]);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("istnene index String in sinirlari disinda");
        }catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("istenen index Arrayin sinirlari disinda");
        }
        */
        //2. cozum ic ice try catch

/*
        try {
            try {
                System.out.println("String'den istenen index'deki element : " + str.substring(index,index+1));
                System.out.println("Arrayden istenen indexdeki element : " + arr[index]);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("istnene index String in sinirlari disinda");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("istenen index Arrayin sinirlari disinda");
        }

*/
        //3. cozum tek ama daha kapsamli bir exc. kullanma
try {
    System.out.println("String'den istenen index'deki element : " + str.substring(index,index+1));
    System.out.println("Arrayden istenen indexdeki element : " + arr[index]);

}catch (RuntimeException e){
    System.out.println("index String ve/veya Arrayin sinirlari disinda");
    e.printStackTrace();
}


    }
}
