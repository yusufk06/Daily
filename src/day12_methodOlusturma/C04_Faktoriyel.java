package day12_methodOlusturma;

public class C04_Faktoriyel {
    public static void main(String[] args) {
        //verilen bir sayinin 15 de kucuk bir pozitif tamsayi oldugnu kontrol ein
        //kucukse bir method olusturup faktoryel degeerini yazdirin
        // sayi istenene aralikta degilse uyaru yazdirin
        int input=12;

        if (input>0 && input<15){
            faktoryelYazdir(input);
        }else {
            System.out.println("girilen sayi 15den kucuk pozitif tam sayi olmalidir");
        }


    }

    public  static void faktoryelYazdir(int sayi){
        int faktoryelSonucu=1;
        for (int i =sayi; i >=1 ; i--) {
            faktoryelSonucu*=i; // her loopda gelen sayiyi onceki deger ile carpalim

        }
        System.out.println("Girilen" + sayi + " icin faktroyel :" + faktoryelSonucu);
    }
}
