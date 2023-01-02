package day27_overriding;

public class EParent extends  DGrandParent {


    @Override
    protected void method1() {
        System.out.println("P method1");
        // @override notasyonu overridden method ile overriding method u ilisiklendiriir
        //eger ovirriden methodda bu iliskiyi bozacak bir degiiklik yapilirsa
        //@override CTE verir
    }

    protected void method2(){
        System.out.println("P method2");
    }

}
