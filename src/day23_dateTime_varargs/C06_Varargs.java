package day23_dateTime_varargs;

public class C06_Varargs {
    public static void main(String[] args) {

        // oyle bir method olusturalim ki
        //kactane argument yazarsam yazayim
        //argumentlerin toplamini versin

        topla(5,6);
        topla(5,6,8,9,3);


        /*
        Varargs array altyapisini kullanir
        temel hedef argument sayisi degisse bile
        ayni data turundeki tum argumentleri alabilecek bir parametre olusturmaktir

         */
    }

    private static void topla(int... sayilar) {
        int toplam1=0;
        for (int i = 0; i <sayilar.length ; i++) {
            toplam1+=sayilar[i];


        }
        int toplam2=0;
        System.out.println(toplam1);

        for (int each:sayilar
             ) {
            toplam2+=each;


        }
        System.out.println(toplam2);
    }



}
