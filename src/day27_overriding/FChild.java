package day27_overriding;

public class FChild extends EParent{

    @Override
    protected void method1() {
        super.method1();
        //eger overriding method ile birlikte overriden methodda calissin istersek
        //overriding methdd icinden super.method1() yazabiliriz.

    }

    @Override
    protected void method2() {

    }
}
