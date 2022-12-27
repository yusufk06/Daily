package day23_dateTime_varargs;

public class C07_Varargs {
    public static void main(String[] args) {
        // kac tane string argument yazilirsa yazilsin
        // argumentlerin en uzun olanini yazdiran bir method olusturun
        //not: en uzun kelime olarak birden fazla kelime varsa  ilkini yzdirin


        enUzunuYazdir("Ilyas", "Berivan","Murat");



    }

    private static void enUzunuYazdir(String... kelimeler) {

        String enUzunKelime=kelimeler[0];
        for (String eachKelime:kelimeler
             ) {

            if(eachKelime.length()>enUzunKelime.length()){
                enUzunKelime=eachKelime;
            }

        }
        System.out.println(enUzunKelime);
    }
}
