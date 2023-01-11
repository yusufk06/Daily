package day31_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList {

    public static void main(String[] args) {

        /*
        Collections objeleri bir arada tutan yapilardir
        Gercek hayattaki ihtiyaclara gore java farkli collection yapilari olusturmustur
        Bir uygulamada hangi collection i kullanacagimiza istedigimiz ozelliklere gore karar veririz

        Collections temelde 3 ana gruba ayrilir ve 3 interface ile kurallari belirlenmistir
        =List
        -Queue
        -Set
        Ancak interfacelerden obje olusturulamayacagi icin child class larinin constructorlari kullanilir
        Burada ozellikleri belirleyen constructor degil data turu olarak secilen collectiondir

        Ornegin LinkedList olustururken sececegimiz data turu ile Queue, Deque , List veya tumunun
        ozelliklerini tasiyan LinkedList ler olusturabiliriz
         */

        LinkedList<String> ll1=new LinkedList<>();
        List<String> ll11=new LinkedList<>();
        Queue<String> ll211=new LinkedList<>();
        Deque<String> ll311=new LinkedList<>();


    }
}
