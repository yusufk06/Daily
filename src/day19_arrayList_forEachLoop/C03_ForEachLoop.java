package day19_arrayList_forEachLoop;

public class C03_ForEachLoop {
    public static void main(String[] args) {

        /*
        eger coklu element iceren bir yapidaki tum elementlere
        ayni islemi yapmak istiyorsak index den bagimsiz olarak for each loop
        kullanilabilir
         for each loop da 3 seyi belirtmemiz gerekir
         - getirilecek elementlerin data turu
         - getirilen elemente verilecek isim (genelede each / w kullanilir
         - nereden getirilecegi
         */





        int[] arr={3,5,6,7,7,7,45,34,};
        // bu arrayin tum elementlerini yazdiralim
        for (int each:arr
             ) {
            System.out.print(each+ " "); //3 5 6 7 7 7 45 34

        }

// tum elementleri toplayalim
        int toplam=0;
        for (int each:arr
             ) {
            toplam+=each;

        }
        System.out.println("sayilarin toplami : "+ toplam);//sayilarin toplami : 114


        //tum sayilarin karelerini toplayalim
        toplam=0;
        for (int each:arr
             ) {
            toplam+=each*each;
        }
        System.out.println("sayilarin kareleri toplami"+ toplam);//sayilarin kareleri toplami3398sayilarin kareleri toplami3398

    }
}
