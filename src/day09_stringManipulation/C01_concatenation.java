package day09_stringManipulation;

public class C01_concatenation {
    public static void main(String[] args) {

        //cantains

        String str="Java ogren, mutlu ol";

        // str mutlu iceriyormu
        str.contains("mutlu");
        System.out.println(str.contains("mutlu")); //true
        //charSequence : char dizisi
        //aradigimiz metnin String olmasi sart degil charda olabilir

        System.out.println(str.contains("j")); // false

        System.out.println(str.contains(" ")); // true
        //contains methodu kac tane oldugunaa degil
        //sadece var olup olmadigina bakar




    }
}
