package day23_dateTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {

        LocalDate dogumTarihi=LocalDate.of(1992,7,10);
        LocalDate bugun=LocalDate.now();

        Period yas =Period.between(dogumTarihi,bugun);
        System.out.println(yas);//P30Y5M10D
        System.out.println(yas.getYears());//30

        LocalDate baslangic=LocalDate.of(2018,2,1);
        LocalDate bitis=LocalDate.of(2022,9,13);
        Period sure= Period.between(baslangic,bitis);
        System.out.println(sure);//P4Y7M12D
    }
}
