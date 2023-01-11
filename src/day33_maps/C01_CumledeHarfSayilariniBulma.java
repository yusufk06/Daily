package day33_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C01_CumledeHarfSayilariniBulma {
    public static void main(String[] args) {

        //verilen bir cumlede kullanilan her bir harfi
        //ve kacar kez kullanildigini yazdirin

        //ornek ; Java candir
        //output ;  J=1,a=3, v=1, c=1, n=1, d=1, i=1, r=1

        String cumle= "Java candir";

        // oncelikle bosluk ve noktalama isaretlerini yok edelim
        cumle=cumle.replaceAll("\\W","");

        String[] cumleArr=cumle.split("");//[j,a,v,a,c,a,n,d,i,r]
        Map<String,Integer> kullanimSayilari= new TreeMap<>();

        for (int i = 0; i < cumleArr.length; i++) {
            //her bir elementi ele alip
            // mapde key olarak yoksa value=1 olarak ekleriz
            //map de key olarak varsa value 1 artirilmali

            if (!kullanimSayilari.containsKey(cumleArr[i])){
                kullanimSayilari.put(cumleArr[i],1);

            }else {
                int eskiValue=kullanimSayilari.get(cumleArr[i]);
                kullanimSayilari.put(cumleArr[i],eskiValue+1);
            }

        }
        System.out.println(kullanimSayilari);



    }
}
