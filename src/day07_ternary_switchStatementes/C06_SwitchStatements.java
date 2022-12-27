package day07_ternary_switchStatementes;

public class C06_SwitchStatements {
    public static void main(String[] args) {

        //Kullanicidan 2 sayi alin
        //ve kullaniciya 2istedigi islemi sorun
        //+, -, * , / isaretlerinden hangisni girerse
        //2 sayi icin o islemi yapin
        //bu israetlerden birini girmezse
        // "yanlis islem tercihi" yazdirin

        int sayi1=20;
        int sayi2=10;

        char islem='+';

        //if lese ile yapalim

        if (islem=='+'){
            System.out.println("sayilarin toplami :" + (sayi1+sayi2));
        }
        else if (islem=='-'){
            System.out.println("sayilarin farki :" + (sayi1-sayi2));
        }
        else if (islem=='*'){
            System.out.println("sayilarin carpimi :" + sayi1*sayi2);
        }
        else if (islem=='/'){
            System.out.println("sayilarin bolumu :" + sayi1/sayi2);
        } else {
            System.out.println("yanlis islem terihi");
        }


        // switch statement ile yapalim

        switch (islem){
            case '+' :
                System.out.println("sayilarin toplami :" + (sayi1+sayi2));
                break;
            case '-' :
                System.out.println("sayilarin farki :" + (sayi1-sayi2));
                break;
            case '*' :
                System.out.println("sayilarin carpimi :" + sayi1*sayi2);
                break;
            case '/' :
                System.out.println("sayilarin bolumu :" + sayi1/sayi2);
                break;
            default:
                System.out.println("yanlis islem tercihi");
        }


    }
}
