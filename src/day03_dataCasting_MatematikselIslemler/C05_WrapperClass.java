package day03_dataCasting_MatematikselIslemler;

import com.sun.jdi.IntegerValue;
import com.sun.jdi.Value;

public class C05_WrapperClass {
    public static void main(String[] args) {

        int sayi=10;
        String str="Java Candir";

        Integer sayi2=20;
        String str2="123";
        String str3= "354";

        int str2Int=Integer.parseInt(str2);
        int str3Int= Integer.parseInt(str3);

        System.out.println(str2Int+str3Int);


        System.out.println(Integer.MAX_VALUE);

        char krk1='$';
        System.out.println(Character.isDigit(krk1));

      short sayi3=4;
      int sayi5=sayi3;

    }
}
