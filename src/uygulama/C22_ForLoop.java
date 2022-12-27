package uygulama;

import java.util.Scanner;

public class C22_ForLoop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        String str = scan.nextLine();
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int sayıuzunlu = str.length();
        int sayi = Integer.parseInt(str);



        while (0 <= sayıuzunlu) {
            birlerBasamagi = sayi % 10;
            rakamlarToplami = rakamlarToplami + birlerBasamagi;
            sayi = sayi / 10;
            sayıuzunlu--;
        }
        System.out.println("rakamlar toplamı :" + rakamlarToplami);

        System.out.println(("rakamlar toplami :" + rakamlarToplami));
    }

}


/*
      //Kullanicidan pozitif bir tamsayi alip,
        // rakamlar toplamini yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("pozitif bir tam sayı giriniz");
       String str=scan.nextLine();
        int birlerbasma=0;
        int rakamlartop=0;
        int sayıuzunlu=str.length();
        int sayi=Integer.parseInt(str);
​
        while (0<=sayıuzunlu){
            birlerbasma=sayi%10;
            rakamlartop=rakamlartop+birlerbasma;
            sayi=sayi/10;
            sayıuzunlu--;
        }
        System.out.println("rakamlar toplamı :"+rakamlartop)

 */



