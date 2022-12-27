package day07_ternary_switchStatementes;

public class C02_Ternary2 {
    public static void main(String[] args) {

        //kullanicidan alinan deger 100den buyukse sayiyi 2 ile carpin
        //100den kucuk ise sayiya 10 ekleyin

        int input=45;

        //if else ile yapalim
        if (input>100) {
            input*=2;

        }
        else {
            input+=10;
        }



        //ternary ile yapalim

        input=45;

        input=input>100 ? input*2 : input+10;
        System.out.println(input);


        /*
        verilen inputu nceleyin
        eger 100den buyukse bunu 5e bolup bolum sonucunun tek sayi olup olmadigini kontr edin
        eger 100den buyuk degilse 10 ile bolumunden kalani bulup bu kalani 5 artirin
         */

        // bu tur komplex islemleri ternary ile yapmayiz



    }
}
