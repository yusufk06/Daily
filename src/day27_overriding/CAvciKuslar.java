package day27_overriding;

public class CAvciKuslar extends  BKuslar {

    protected void hareket( ){
        System.out.println("ucarlar");
    }
    protected void beslenme( ) {
        System.out.println(" et yerler");
    }
    protected void pence( ) {
        System.out.println("pencelidir");
    }
    protected void gaga( ) {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {

        CAvciKuslar krt1= new CAvciKuslar();

        krt1.hareket();//  c
        krt1.beslenme();// c
        krt1.pence(); // c
        krt1.gaga();// c

        krt1.kanat(); // b
        krt1.solunum(); // b
        krt1.  cogalma();// b

        krt1.omur(); // a
// eger constructor ile data turu ayni ise ozelligin variable veya method olmasina bakilmaksizn
        //o class a gidilir  o class veya parent class larda bulunan ilk deger kullanilir

        BKuslar krt2=new CAvciKuslar();
        krt2.hareket();//  c
        krt2.beslenme();// c
      //  krt2.pence(); // BKuslar veya parent classda yok CTE
        krt2.gaga();// c

        krt2.kanat(); // b
        krt2.solunum(); // b
        krt2.  cogalma();// b

        krt2.omur(); // a

        AHayvanlar krt3=new CAvciKuslar();

        krt3.hareket();//  c
        krt3.beslenme();// c
      //  krt3.pence(); //  Ahayvanlar classda yok CTE
       // krt3.gaga();//    Ahayvanlar classda yok CTE

      //  krt3.kanat(); // Ahayvanlar classda yok CTE
        krt3.solunum(); // b
        krt3.  cogalma();// b

        krt2.omur(); // a

    }
}
