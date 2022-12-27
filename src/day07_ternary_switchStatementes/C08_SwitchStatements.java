package day07_ternary_switchStatementes;

public class C08_SwitchStatements {
    public static void main(String[] args) {

        //Kullanicidan gun numarasini alin
        //haftaici veya hafta sonu oldgunu yazdirin


        int gunNo=3;

        switch (gunNo){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Haftaici");
                break;
            case 6 :
            case 7 :
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Gecersiz gun numarasin");
        }
    }
}
