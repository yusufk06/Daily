package day10_stringManipulations;

public class C05_soru {
    public static void main(String[] args) {
        /*
        Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve
         kullaniciya duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari
         saglarsa, “sifre basariyla kaydedildi” yazdirin
  - ilk harf kucuk harf olmali
  - son karakter rakam olmali
  - sifre bosluk icermemeli
  - uzunlugu en az 10 karakter olmali
         */
// bu soruda sartlari bagimsiz if cumlesi ile yapmak
        //veya if else ile yapmak mumkundur
        // eger if else ile yaparsak ilk hatada hatayi yazdirir geriye kalanlara bakmaz
        ////avantaji ise eger hata yoksa otomatik olarak basarili sekilde olusturuldu diyebilr

        //eger if ile yaparsak tum hatalari bir kerede soyleyebiliriz
        //dezavantaji bagimsiz if cumeleri kodun geriye kalanini ilgilenmedigindenbasarili sifre
        // olusturuldugunu bizim ayri bir ile kontrol etemmiz gerekir

        String sifre="abczxdfsasd3";


        // sonucta basarili sifre olsturudu demek icin bir kontrool mekanizmasi olusturmamiz gerekir
        // ya her adimda artiracagimiz bir sayac yapip en son 4 oldu ise basarili deriz
        //veya basta verdigimiz deger olumsuz bir durum oldgunda artirilir , en onda kontrl edip
        // eger bastaki degeri hala koruyorsa basarili olmustur diyebilrir

        int flag=0;
        //ilk harf kucuk harf olmali

        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){ // ilk harf kucuk degilse hatayi yazdir
            System.out.println("ilk harf kucuk harf olmali");
            flag++;
        }
         //bir ceza puani aldi


          //      - son karakter rakam olmali

        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
            // son karakter rakam degilse rapor yazdir
            System.out.println("son karakter rakam olmali");
            flag++;
        }



          //      - sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            flag++;



        }
       // - uzunlugu en az 10 karakter olmali

        if (!(sifre.length()>=10)){
            System.out.println("sifrenin uzunlugu en az 10 karakter olmali");
            flag++;
        }




        if (flag==0){
            System.out.println("sifreniz basariyla kaydedildi");
        }


        //calismadi code sharing ile karsilastir




    }
}
