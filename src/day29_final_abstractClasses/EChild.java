package day29_final_abstractClasses;

public class EChild extends DParent{
    @Override
    public void method1() {
        System.out.println("parent class daki mecburi override edilecek method1 i override ettik");
    }

    @Override
    public void method2() {
        System.out.println("parent class daki mecburi override edilecek method2 i override ettik");
    }
    /*
    clasik inheritance ile parent child iliskisi olusturdugumuzda paretn classdaki
    tum ozellikleri otomatik olarak kazaniriz
    ancak methodlari override etme mecburiyeti yoktur
    ister override edip kendimize ozellestiririz
    istersek de parent class daki haliyle kullaniriz

     */
    public static void main(String[] args) {
      //   DParent obj1=new DParent()
       //dparent is abstract ; cannot be instntiated
       //abstract classlarin constructurlari vardir ama obje uretilemez

        EChild chld1=new EChild();
        chld1.method1();
        chld1.method2();
        chld1.method3();

        DParent chld2=new EChild();
        chld2.method1();
        chld2.method2();
        chld2.method3();


    }

}
