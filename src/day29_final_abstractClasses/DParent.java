package day29_final_abstractClasses;

public abstract class DParent {
    /*child class larin tamaminda  method 1 ve method 2 nin mutlaka olmasini
    istiyoruz
    java parent class daki istenene methodlari child calss larin overiride
    etmek zorunda kalmasi icin abstract class ini olusturmustur

    bir class i abstract yaomak istersek class deklarasyonuna abstract yazmamiz
     yeterlidir
     bir abstract class in icinde child classlarin override etmesi mecburi olan methodlar
     olabilecegi gibi mecburi olmayan methodlarda olabilir


     child classlarin mmutlaka override edevegi methodlari da abstract yapariz

     abstract yapilan tum methodlar child classlarin tamaminda override edileceginden
     parent class daki abstract methodun bodye ihtiyaci olmaz.
     javada abstract methodlarin bodysi olmasina izin vermez

     abstract classlarda abstract methodlar bulundugu icin abstract classlardan
     obje uretilemezz

     */

    public abstract void method1();



    public abstract void method2();


    public void method3(){

    }
}
