package day22_immutableClasses;

public class C03_ImmutableClasses {
    public static void main(String[] args) {

        String str="Java";

        str.replace("J","H");
        System.out.println(str); // Java
        str=str.replace("J", "H");
        System.out.println(str); //Hava

        str=str.toLowerCase();
        System.out.println(str); // hava

        // Asagidaki kod calisirsa Java kac obje olusturur?

        String a="ABC"; // 1 obje olusuturuldu
        for (int i = 0; i < 10; i++) {
            a=a+".";  // 10 obje olusuturuldu

        }
        System.out.println(a);
        //ABC..........
        //toplam 11 obje olusturuldu



    }
}
