package day10_stringManipulations;

public class C08_forLoop {
    public static void main(String[] args) {

        // 1 ile 1000 arasindaki sayilari(sinirlar dahil) yanyana yazdirin
        // yazdirma islemi bittiginde
        //"tum bu sayilarin toplami = " deyip sayilarin topla yazdirin

int sayilarinToplami=0;
        for (int i = 1; i <=1000 ; i++) {
            System.out.print(i + " ");
            sayilarinToplami=sayilarinToplami+i;

            System.out.println("");
            System.out.println("tum bu sayilarin toplami = " +sayilarinToplami );

        }
    }
}
