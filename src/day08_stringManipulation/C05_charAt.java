package day08_stringManipulation;

public class C05_charAt {
    public static void main(String[] args) {

        String str= "Java guzeldir"; // bosluk dahil 12 karakter var

        //javada index 0' dan baslar
        // J==> 0. index, r==>12. index
        //charAt(index) ile istedigimiz index'deki char'a ulasabilirz

        // ilk a'yi yazdiralim
        System.out.println(str.charAt(1));
        //sondan 2. harfi yazdiralim
        System.out.println(str.charAt(13-2)); //karakter sayisi -2. indexdeki eleman
        //sondan 4. karakteri buyuk harf olarak verin
        System.out.println(str.toUpperCase().charAt(13-4));//

        //charAt metodu bize char dondurdugu icin toUpperCase() calismaz
        //String methodlarini charAt() ile kullanmak isterseniz
        //charAt den once kullanmalisiniz


       // System.out.println(str.charAt(13)); //hata verir
        //eger index olarak karakter sayisi veya daha buyuk bir deger girilirse
        // o indexi bulamayacagi icn hata verir.

    }
}
