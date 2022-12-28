package day25_inheritance;

public class BDoktor extends APersonel {

    // olusturdugumuz doktor classinda isim soyisim gibi
    //personel classinda olusturulan tum ozelliklerin olmasini
    //istiyoruz. Bu durumda 2 tercih var
    //1- istenen tum ozellikleri doktor classinda yeniden olusturabilirsiniz
    //2- doktor class ini Personelin childi yapmak

    //Doktor class ini Personel class inin childi yaptigimizda
    //Doktor classindan olusturulan objeler sadece kendi classlarindaki
    //ozelliklere sahip olmaz ayni zamanda parent classi olan
    //personeldeki ozelliklerede sahip olurlar
/*
bir child classdan obje olusturgumuzda o objenin ozelliklerini belirlerken
once kendi class ina bakilir ve o ozellik varsa kullanirlir
eger kendi classinda yoksa parent class a bakilir

bir clas wxtend keyword kullanarak baska bir classi kendisine parent edinirse

1- parent class daki tum ozellikleri direkt kullanabilir
(isim,soyisim,telefon, ozelSigorta)
2- isterse paretn classda olan bir ozelligi kendisine uyaralayabilir
(maas)
3-isterse parent class da olmayan kendisine ozel yeni ozellikler
olusturabilir
(nobet)
 */

    public static void main(String[] args) {

        BDoktor dok1 = new BDoktor();
        dok1.isim = "Yusuf";
        dok1.soyisim = "Kombe";

        System.out.println(dok1.isim + "," + dok1.soyisim + "," + dok1.telefon);
        //Yusuf,Kombe,Telefon atanmadi
        dok1.maas();
        dok1.ozelSigorta();
        //Tum personelin ozel saglik sigortasi yaptirilir
        dok1.nobet();


    }

public  void  maas(){
    System.out.println("Doktor maasi 30*8*25 : "+ 6000);
}
public  void nobet(){
    System.out.println("doktorlar haftada 1 gun nobet tutar");
}

}
