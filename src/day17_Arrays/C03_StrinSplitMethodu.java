package day17_Arrays;

import java.util.Arrays;

public class C03_StrinSplitMethodu {
    public static void main(String[] args) {

        String str="Java her gecen gun guzellesiyor";

        //str dakac kelime var ? 5
        //Split methodu istedigimiz Stringi istedigimiz ayirac kullanarak
        //parcalara ayirmamiza imkan verir

        String[] spaceSplit=str.split(" ");
        System.out.println(Arrays.toString(spaceSplit));

    }
}
