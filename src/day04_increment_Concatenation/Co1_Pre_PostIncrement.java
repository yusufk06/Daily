package day04_increment_Concatenation;

public class Co1_Pre_PostIncrement {

    public static void main(String[] args) {

        int x=20; //x21 y20 y21 z20
        int y=++x;
        int z=y++;

        System.out.println(x+ "," + y + "," + z);

    }
}
