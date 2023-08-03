package Gun27._03_Ornek;

import java.util.ArrayList;

public class Student {

    String name; // 2.adim
    int maxSaat;

    ArrayList<Lesson> dersleri = new ArrayList<>();

    public void dersYazdir(){
        System.out.println("\n*** Transkript ***");
        System.out.println("Sayin , "+this.name);
        System.out.println("Aldiginiz dersler asagidadir");

        for (Lesson d:this.dersleri) {
            System.out.println(d.name+"-"+d.saat);
        }
    }
    public static void universiteKurallari(){ // 6.adim
        System.out.println("Kural 1 - Caysiz uzumsuz okula gelme");
        System.out.println("Kural 2 - Uykunu mutlaka al");
        System.out.println("Kural 3 - Her zaman dinc dinamik ol");
        System.out.println("Kural 4 - Kampta oldugunu unutma !!");
        System.out.println("Kural 5 - Tester olacagiz");
        System.out.println("Tekrarsiz derse gelme");


    }



}
