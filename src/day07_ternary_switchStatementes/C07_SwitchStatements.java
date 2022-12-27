package day07_ternary_switchStatementes;

public class C07_SwitchStatements {
    public static void main(String[] args) {

       // kullanicidan gun numarasini alip
       // gun ismini yazdirin

       int gunNo=3;

       switch (gunNo){
           case 1 :
               System.out.println("Pazartesi");
               break;
           case 2 :
               System.out.println("Sali");
               break;
           case 3 :
               System.out.println("carsamba");
               break;
           case 4 :
               System.out.println("Persembe");
               break;
           case 5 :
               System.out.println("Cuma");
               break;
           case 6 :
               System.out.println("C.tesi");
               break;
           case 7 :
               System.out.println("Pazar");
               break;
           default:
               System.out.println("Gecersiz gun numarasin");
       }



    }
}
