package uygulama;

public class C11_ForLoop {
    public static void main(String[] args) {
        /*
        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
//hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
//Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
  6! = 6 * 5 * 4 * 3 * 2 * 1 = 720 bunu nasil yazdiracaz yapan var mi
         */

        int input=5;
        int carpim=1;
        for (int i =input; i >=1 ; i--) {
            carpim*=i; {

            }

        }
        System.out.print( "verilen "  + input + " sayisinin faktoriyeli : " + carpim);
    }
}
