package day12_methodOlusturma;

public class C09_FibonacciSerisi {
    public static void main(String[] args) {
        //verilen sayi adedince fiibonacci serisinden sayilar yadiran bir method olustunr
        //fibonacci serisi =0 1 1 2 3 5 8 13 21 34.......

        fibonaccidenSayiYazdir(16);

    }

    public static void fibonaccidenSayiYazdir(int adet) {
        //kullanicin girdigi sayi 0 veya negatif ise
        if (adet<=0){
            System.out.println("gecersiz giris");
        } else if (adet==1) {
            System.out.println("0");

        } else if (adet==2) {
            System.out.println("0 1");

        }else {
            int sayi1=0;
            int sayi2=1;
            int sayi3=0;
            System.out.print("0 1 ");
            // 0 1 1 2 3 5 8 13 21 34
            for (int i = 3; i <=adet ; i++) {
                sayi3=sayi1+sayi2;
                System.out.print(sayi3+ " ");
                sayi1=sayi2;
                sayi2=sayi3;
            }
            System.out.println("");
        }


    }
}
