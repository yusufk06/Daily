package day09_stringManipulation;

public class C05_indexOf {
    public static void main(String[] args) {

        String str= "Java ile kodlama cok kolay";
        //str "cok" iceriyor mu
        System.out.println(str.contains("cok"));//true
        //kullanicidan aldigimiz cumle "cok" ile baslayan ilk kelimeyi yazdirin

        System.out.println(str.indexOf("cok"));
        System.out.println(str.indexOf("a", 5));
    //2. o nun indexini yazdirin
        //once ilk onun indexini buluruz
        //sonra o indexden sonrasinda 2.oyu aratiriz

        int ilkoindexi=str.indexOf("o"); //10
        int ikincioindexi=str.indexOf("o", ilkoindexi+1);



       // System.out.println(str.indexOf("o", 11));

    }
}
