package day10_stringManipulations;

public class C10_ForLoop {
    public static void main(String[] args) {
        //input olarak verilen sayidan baslayarak
        // 7ser 7ser artirarak input olarak verilen bitis sayisina kadar
        //- tum sayilari
        //- kaca adet sayi oldugunu
        //- ve bu sayilarin toplaminin kac oldugunu yazdirin

        int inputBas= 34;
        int inputBit=563;

        int sayac=0;
        int toplam=0;


        for (int i = inputBas; i <=inputBit ; i+=7) {
            System.out.print(i + " ");
            sayac++;
            toplam+=i;

        }
        System.out.println("");
        System.out.println("Toplam " + sayac + "adet sayi var \nBu sayilarin Ytoplami :" + toplam);


    }
}
