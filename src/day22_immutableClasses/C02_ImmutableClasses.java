package day22_immutableClasses;

import java.util.Arrays;

public class C02_ImmutableClasses {
    public static void main(String[] args) {

        String str="Java";
        System.out.println(str.toUpperCase());//JAVA

        str.toLowerCase();

        System.out.println(str); // Java

        // String immutable oldugundan , methodlar kalici degisiklik yapamaz.

        int [] arr={9,5,3};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr)); //[3,5,9}

        //Array mutable bir class oldugu icin method ile yaptigimiz degisiklik kalici olur




    }
}
