package day10_stringManipulations;

public class C03_replaceALL {
    public static void main(String[] args) {

        //bu metindeki sayilardan kurtulun
        String str="Ja1va 56Gu, zel-dir";

        System.out.println(str.replace("1", "" )
                .replace("5", "")
                .replace("6", ""));

        str="Ja1va4 567Gu, z9el-d0ir8";

        //replace methodu zaten istenen degisikligi verilen ozelllige uyan tum degerler icin
        //yapar
        //eger genellemyi butun sayilari butun spaceleri butun ozel karakterleri
        //gibi genisletmek istersek replace yerine replaceAll kullaniriz

        // java bu genellemeleri yazabilmemiz icin regex(regular expressions) tanimlamistir

        //  \\d : butun digitler

        System.out.println(str.replaceAll("\\d", "")); //Java Guz, zel-dir
        // ozel karakterlerden de kurtulun

        System.out.println(str.replaceAll("\\W", "")); // bosluklarda gitti

        // space de ozel karakter oldugundan bu durumda spacein yok olmamasi icin
        // once space yerine metinde olmayan bir deger atayalim

        str=str.replace(" ", "5"); // 5 mesela
        str.replace("5", " ");

        // buradaki harf sayisini bulun
        String input3= "Ali Can, Merve Star, Mark Tom";
        input3=input3.replaceAll("\\W", "");
        System.out.println(input3.length()); // 22


    }
}
