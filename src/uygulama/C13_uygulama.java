package uygulama;

public class C13_uygulama {
    public static void main(String[] args) {

        /*
     kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip ,
     sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yaziniz
     input:java1 ogRe2@nMek3 #ne +Gu=zel
      output=Java ogrenmek ne guzel.
     */


       String input="java1 ogRe2@nMek3 #ne +Gu=zel";


        input=input.replaceAll("\\d", "");
        input=input.replace(" " , "5");
        input=input.replaceAll("\\W", "");

        input=input.replace("5", " ");
        input=input.toLowerCase();
        input=input.replaceFirst("j", "J");
        System.out.println(input);
    }
}
