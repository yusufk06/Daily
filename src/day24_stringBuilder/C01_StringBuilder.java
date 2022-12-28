package day24_stringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder();
        //kapasitesi 16 olanbos bir  StringBuilder olusturur
        System.out.println(sb1);

        System.out.println(sb1.capacity()); //alabilecegi karakter sayisi 16

        StringBuilder sb2=new StringBuilder(11); // kapasitesini belirledik

        StringBuilder sb3=new StringBuilder("Java Candir"); //27

        sb2.append("Java");
        System.out.println(sb2);//Java
        System.out.println(sb2.capacity());//11
        sb2.append(" Candir");
        System.out.println(sb2);// Java Candir
        System.out.println(sb2.capacity());//11
        sb2.append(".");
        System.out.println(sb2);//Java Candir.
        System.out.println(sb2.capacity());   //24 2*11+2 yapiyor kendisi

        sb2.trimToSize(); // uzunluga kadar kirp demek


    }
}
