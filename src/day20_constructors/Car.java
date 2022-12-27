package day20_constructors;

public class Car {

    /*
    bir classdan olusturulabilecek objelerin ozelliklerini
    variable veya methdlarla belirleyebilirz


     */
    String marka = "Marka belirtilmemis";
    String model = "Model belirtilmemis";
    int yil=1900;
    int km;
    String renk="Renk secilmedi";

    public Car() {

    }

    public Car(String marka, String model, int yil) {
        this.marka=marka;
        this. model=model;
        this. yil=yil;
    }


    public static void hareket(){
        System.out.println("Tum arabalar hareket eder");
    }

    public Car(String marka, String model, int yil, String renk) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.renk = renk;
    }

    public Car(String mrk, String mdl, int yl, int kmetre, String rnk){
       marka=mrk;
       model=mdl;
       yil=yl;
       km=kmetre;
       renk=rnk;
    }

    /*
    bir class da gorunur bir constructor olusturudugumuzda
    java default constructoru siler
    bu durumda daha onceden default constructori kulllanarak obje olusturan classslarda
    CTE olusur
    bu tur sorunlara sebep olmamak icin biz herhangi bir costructor olusturdugumuzda
    bir tane de parametresi constructor olustururuz


    Constructor da parametre olarak kullanicidan gelen degeri
    class level daki instance variable a atamaliyiz
    eger parametre ismi ile instance variable ismi farkli ise sorun yok
    java otomatik olarak atamamizi anlayacaktir
     public Car(String mrk, String mdl, int yl, int kmetre,String rnk){ public Car(String mrk, String mdl, int yl, int kmetre,String rnk) gibi
      marka=mrk;
       model=mdl;
       yil=yl;
       km=kmetre;
       renk=rnk;

       eger parametre isimlerini anlasilir olmasi icin instance variable ile ayni
       yaparsak javanin ayni isimdeki iki varialenin hangisinin parametre hangisinin
       instance olacagini bilmesi gerekir
       bu durumda instance variable i belirlemek icin basina this. yazariz
     public Car(String marka, String model, int yil) {
        this.marka=marka;
        this. model=model;
        this. yil=yil;       gibi



     */











    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                "\n, model='" + model + '\'' +
                "\n, yil=" + yil +
                "\n, km=" + km +
                "\n, renk='" + renk + '\'' +
                '}';
    }
}
