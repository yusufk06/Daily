package day12_methodOlusturma;

public class C03_AsalSayi {
    public static void main(String[] args) {

        //verilen bir sayinin asal olup olmadigini true/ false olarak donduren
        //bir method olusturun

        //asalSayiMi methodu boolean bir sonuc dondurdugunden
        // bu methodu calistirdigimizda ya direk yazdirmaliyiz
        System.out.println(asalSayiMi(34));//false
        //veya method callun getirecegi sonucu atamak icn bir variable olusturabilirim
        boolean asalMiSonucu59=asalSayiMi(59);

    }

    public  static boolean asalSayiMi(int input){

        boolean asalSayiMi=true;
        for (int i = 2; i <input ; i++) {
            if (input%i==0){ // eger burasi calisirsa asal sayi degil
               asalSayiMi=false;
               break;
            }
        }
        return  asalSayiMi;
    }
}
