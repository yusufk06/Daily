package day24_stringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Java");
        System.out.println(sb.capacity());//20   16+4
        System.out.println(sb.length()); //4

        sb.trimToSize();
        // atama yapmadigmiz halde bu degisiklik kalici olur mu?
        // StringBuilder mutable oldugundan methodlarla yapilan degisiklikler kalici olur
        System.out.println(sb.capacity());//4

        sb.toString().toUpperCase();
        System.out.println(sb);//Java
        //StringBuilder i Stringe cevirirseniz veya String dondurecek methodlar kullanirsaniz
        // Stringin immutable ozelligi devreye girer ve yapilan degisiklikler kalici olmaz

       // sb=sb.toString().toUpperCase(); // atama yapilamaz data tipleri farkli oldugu icin

        StringBuilder sb2=new StringBuilder(sb.toString().toUpperCase()); // yapilabilir
        System.out.println(sb2);//JAVA
        sb=sb2;
        System.out.println(sb); //JAVA

        sb.setCharAt(0,'H');
        System.out.println(sb);//HAVA

        System.out.println(sb.substring(2, 3));//V ama kalici olmaz

        System.out.println(sb.reverse());//AVAH

        sb.insert(1,"H "); //AH VAH
        String uzunMetin=" ETMEK YOK CALISMAK VAR";

        sb.insert(6,uzunMetin,0,10); //AH VAH ETMEK YOK

        sb.indexOf("A",3);//3. indexden sonra ilk A yi bulur 4
        sb.indexOf("VAH");//3

        sb.lastIndexOf("VAH");//3
        sb.lastIndexOf("E",9);//7

        sb.replace(0,12,"Sorun"); // Sorun YOK

        sb.delete(5,sb.length());//Sorun // Baslangic indexi dahil Bitis indexi dahil degil




    }
}
