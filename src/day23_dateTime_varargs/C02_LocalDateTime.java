package day23_dateTime_varargs;

import java.time.LocalDateTime;

public class C02_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);//2022-12-20T12:30:08.571494

        System.out.println(ldt.getDayOfWeek());//TUESDAY

        System.out.println(ldt.withYear(2030));//2030-12-20T12:33:23.834084


    }
}
