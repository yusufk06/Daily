package uygulama;

import java.util.Scanner;

public class C21HarmonikSayilar {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("harmonik sayisi giriniz");
        double h = scan.nextDouble();
        double harmonic=0.0;
        while (h>0){
        harmonic=harmonic + 1/h;

            h--;
        }
        System.out.println(harmonic);



        }
    }
