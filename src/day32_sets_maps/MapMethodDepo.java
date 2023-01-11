package day32_sets_maps;

import java.util.*;

public class MapMethodDepo {
    // bize ogrenciMap donduren bir method olusturun

    public static Map<Integer, String> ogrenciMapOLustur() {

        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");

        return ogrenciMap;

    }

    public static boolean isimIleOgrenciArama(Map<Integer, String> ogrenciMap, String isim) {

        //1- tumm valueleri bir collection olarak kaydedelim
        //[Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Cemal-Han-12-M-MF]

        Collection<String> valuesCollection = ogrenciMap.values();

        //2- for each kullanarak her bir valueyi ele alalim Ali-Can-11-H-MF
        //3- -'yi kullanarak split yapalim [Ali,Can,11,H,MF]
        //4- split yaptigimiz arrayden isim bilgisini alalim 0.index
        //5- eger value den aldigimiz isim aranan isim ile ayni ise
        //  true dondurup, for each i bitirelim
        //6- for each bittiginde true olmadiysa false dondurelim

        for (String eachValue : valuesCollection
        ) {
            String[] valueArr = eachValue.split("-");
            String valudekiIsim = valueArr[0];
            if (valudekiIsim.equalsIgnoreCase(isim)) {
                return true;
            }
        }

        return false;
    }

    public static void soyisimIleOgrenciListesiYazdirma(Map<Integer, String> ogrenciMap, String soyisim) {
        //1- map deki value leri bir collection olarak kaydedelim
        //  [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Cemal-Han-12-M-MF]
        Collection<String> ogrenciValueCollection = ogrenciMap.values();
        //Listenin ilk satiri olarak basliklari yadiralim
        System.out.println("Isim Soyisim Sinif Sube");

        //2- for each ile her bir value bilgisini ele alalim Ali-Can-11-H-MF
        //3- value yu - ile split yapip bir array elde edelim [Ali,Can,11,H,MF]
        //4- array in 1. index'indeki soyisme bakip aranan soyisim ile ayni ise
        //   isim,soyisim,sinif,sube bilgilerini yazdiralim

        for (String eachValue : ogrenciValueCollection
        ) {
            String[] valueArr = eachValue.split("-");
            String valuesoyisim = valueArr[1];
            if (valuesoyisim.equalsIgnoreCase(soyisim)) {
                System.out.println(valueArr[0] + " " + valueArr[1] + " " + valueArr[2] + " " + valueArr[3]);
            }
        }

    }


    public static void subeListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif, String sube) {

        Collection<String> valueCollection = ogrenciMap.values();
        System.out.println("Ismi  Soyisim");
        for (String eachValue : valueCollection
        ) {
            String[] valueArr = eachValue.split("-");
            if (valueArr[2].equalsIgnoreCase(sinif) && valueArr[3].equalsIgnoreCase(sube)) {
                System.out.println(valueArr[0] + "  " + valueArr[1]);

            }

        }


    }

    public static Map<Integer, String> numaraIleSubeDegistirme(Map<Integer, String> ogrenciMap, int okulNo, String yeniSubeIsmi) {

        //1- okul numarasini biliyoruz , direk ogrenci valuye ulasabilirz
        String ogenciValue = ogrenciMap.get(okulNo);//Ayse-Can-10-H-MF

        String[] valueArr = ogenciValue.split("-");//[Ayse,Can,10,H,MF]

        //2- sube ismini guncelleyelim

        valueArr[3] = yeniSubeIsmi;//[Ayse,Can,10,M,MF]

        //3- array deki guncel bilgileri yeniden value formatinda bir String yapalim
        String yeniValue = valueArr[0] + "-" + valueArr[1] + "-" + valueArr[2] + "-" + valueArr[3] + "-" + valueArr[4];
        //4- ogrenci no yani key ile yeni valueyu mape ekleyelim
        ogrenciMap.put(okulNo, yeniValue);

        return ogrenciMap;
    }

    public static void sinifListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif) {

        System.out.println("No Isim Soyisim Bolum");
        System.out.println("======================");

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eachEntry : entrySeti
        ) {
            //1- entryden valueyu allaim
            String entryValue = eachEntry.getValue();

            //2- bu value yi parcalayim ve bir arraye store edelim

            String[] valueArr = entryValue.split("-");
            // [Ali,cAn,11,H,MF]

            //sinif bilgisini kontrol edip
            //istenen sinif ile ayni ise, istenen bilgileri yazdiralim

            if (valueArr[2].equalsIgnoreCase(sinif)) {

                System.out.println(eachEntry.getKey() + " " + valueArr[0] + " " + valueArr[1] + " " + valueArr[3]);
            }


        }


    }

    public static void BolumListesiYazdirma(Map<Integer, String> ogrenciMap, String bolum) {

        System.out.println("No Isim Soyisim Sinif");
        System.out.println("======================");

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eachEntry : entrySeti
        ) {
            //1- entryden valueyu allaim
            String entryValue = eachEntry.getValue();

            //2- bu value yi parcalayim ve bir arraye store edelim

            String[] valueArr = entryValue.split("-");
            // [Ali,cAn,11,H,MF]

            //sinif bilgisini kontrol edip
            //istenen sinif ile ayni ise, istenen bilgileri yazdiralim

            if (valueArr[4].equalsIgnoreCase(bolum)) {

                System.out.println(eachEntry.getKey() + " " + valueArr[0] + " " + valueArr[1] + " " + valueArr[2]);
            }


        }
    }

    public static Map<Integer, String> soyisimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {

        //1-entrySet olusturalim
        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        //2- foreach loop ile her bir entry yi elden gecirip, soyisimleri buyuk harf yapalim
        for (Map.Entry<Integer, String> eachEntry : entrySeti) {
            //3- entry den value yu  alalim
            String entryValue = eachEntry.getValue(); // Ali-Can-11-H-MF
            //4- soyisim bilgisine ulasip degistirebilmek icin parcala

            String[] entryValueArr = entryValue.split("-");

            //5- soyismi buyuk harf yapalim

            entryValueArr[1] = entryValueArr[1].toUpperCase(); //  [Ali,CAN,11-,H,MF]

            //6- degisikligi yaptiktan sonra yeniden birlestirmeleri yapip
            // mapi update etmeliyiz

            //7-setvalue() kullanarak value yu yeni haline update edelim
            eachEntry.setValue(entryValueArr[0] + "-" +
                    entryValueArr[1] + "-" +
                    entryValueArr[2] + "-" +
                    entryValueArr[3] + "-" +
                    entryValueArr[4]);


        }


        return ogrenciMap;
    }

    public static void tumListeYazdir(Map<Integer, String> ogrenciMap) {
        Set<Map.Entry<Integer, String>> ogrenciEntrySet = ogrenciMap.entrySet();
        System.out.println("No   Ogrenci Bilgileri");
        System.out.println("=======================");

        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySet
        ) {
            System.out.println(eachEntry);
        }


    }

    public static Map<Integer, String> siniflariArtir(Map<Integer, String> ogrenciMap) {
        //map de istedigimiz degisikligi yaptiktan sonra
        // map i update etmenin en kolay yolu setEntry() dir


        Set<Map.Entry<Integer, String>> EntrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eacEntry : EntrySeti) { //101=Ali-Can-11-H-MF

            String entryValue = eacEntry.getValue();// Ali-Can-11-H-MF
            String[] entryValueArr = entryValue.split("-");//[Ali,Can,11,H,MF]

            int sinifInt = Integer.parseInt(entryValueArr[2]);
            if (sinifInt == 12) {
                entryValueArr[2] = "Mezun";
            } else {
                entryValueArr[2] = sinifInt + 1 + "";

                // sinif bilgisini guncelledik
                // bu guncellemeyi map e islememiz lazim

                eacEntry.setValue(entryValueArr[0] + "-" +
                        entryValueArr[1] + "-" +
                        entryValueArr[2] + "-" +
                        entryValueArr[3] + "-" +
                        entryValueArr[4]);
            }
        }


        return ogrenciMap;
    }

    public static void sinifSiraliListeYazdir(Map<Integer, String> ogrenciMap) {
        //101=Ali-Can-11-H-MF
        //11 H Ali Can 101 olmali

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();
        Set<String> siraliOgrenciSeti = new TreeSet<>();
        for (Map.Entry<Integer, String> eachEntry : entrySeti) {
            String entryValue = eachEntry.getValue();

            String[] entryValueArr = entryValue.split("-");

            //Entry den istenen bilgileri alip yeni bir String olusturacagiz
            // ve bu Stringleri sirali olarak yazdiracagiz

            String istenenFormattakiBilgi = entryValueArr[2] + " " +
                    entryValueArr[3] + " " +
                    entryValueArr[0] + " " +
                    entryValueArr[1] + " " +
                    eachEntry.getKey();
            siraliOgrenciSeti.add(istenenFormattakiBilgi);

        }
        System.out.println(" sinif sube isim soyisim no");
        System.out.println("===========================");

        for (String each : siraliOgrenciSeti) {
            System.out.println(each);
        }


    }

    public static void isimSoyisimSiraliListeYazdir(Map<Integer, String> ogrenciMap) {
        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();
        Set<String> siraliOgrenciSeti = new TreeSet<>();

        for (Map.Entry<Integer, String> eachEntry : entrySeti) {
            String entryValue = eachEntry.getValue();

            String[] entryValueArr = entryValue.split("-");

            String istenenFormattakiBilgi = entryValueArr[0] + " " +
                    entryValueArr[1] + " " +
                    eachEntry.getKey() + " " +
                    entryValueArr[2] + " " +
                    entryValueArr[3] + " " +
                    entryValueArr[4];
            siraliOgrenciSeti.add(istenenFormattakiBilgi);

            System.out.println(" isim soyisim no sinif sube bolum");
            System.out.println("===========================");

            for (String each : siraliOgrenciSeti) {
                System.out.println(each);
            }

        }
    }
}

