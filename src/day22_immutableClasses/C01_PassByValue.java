package day22_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {
    public static void main(String[] args) {

        //verilen bir list de degisiklik yapan 2 method olusturun
        //1.method listin elementlerine yeni deger atayip yazdirisin
        //2. method liste yeni bir list deger atayipyeni liste elementler ekleyp yazdirsin
        // her iki methodu cagirdiktan sonra main method daki listi yazdiralim


        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(34);
        sayilar.add(45);
        System.out.println(sayilar);//{10, 34, 45}

        elemanlariDegistir(sayilar);
        System.out.println("1.method calldan sonra sayilar"+ sayilar);
        //1.method calldan sonra sayilar[25, 54, 67]
        yeniListAta(sayilar);
        //yeni list ata methodudna sayilar Listi [34, 98, 11]
        System.out.println("2.method calldda nsonra sayilar "+ sayilar);
        //2.method calldda nsonra sayilar [25, 54, 67]

        /*
        java PassByValue kullanir

            PassByValue , method a gonderilen variablenin kendisini degil degerini gondermek demektir
        primitiv data turleri veya String gonderdigimizde methodda yapilan degisiklik methodda kalir
        main methodda atama yapilmadikca main methodda ki variablenin degeri DEGISMEZ
            PassByValue coklu element icern array ve list gibi yapilar icin de GECERLIDIR
            ancak coklu elementi value olarak methoda gondermediginden
            array veya listin adresini gonderir.
            Eger methodda elementlere atama yapilirsa, main methoddaki  elementlerde degismis olur
            Eger list veya arraye yeni bir list veya array degeri atanirsa bu atama methodda kalir
            main methoddaki list veya arrray DEGISMEZ

             Araba ayni kaldigi muddetce icindekilerin degismesi passByValue e aykiri degildir


         */
    }

    public static void elemanlariDegistir(List<Integer>sayilar){
        sayilar.set(0,25);
        sayilar.set(1,54);
        sayilar.set(2,67);
        System.out.println("elemanlari degistir methodunda list"+sayilar);
        //elemanlari degistir methodunda list[25, 54, 67]

    }


    public static void yeniListAta(List<Integer>sayilar){
        sayilar=new ArrayList<>();
        sayilar.add(34);
        sayilar.add(98);
        sayilar.add(11);
        System.out.println("yeni list ata methodudna sayilar Listi "+ sayilar);

    }
}
