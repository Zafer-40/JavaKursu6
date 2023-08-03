package Tekrar.Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        ArrayList<Integer> matNot = new ArrayList<>();
        ArrayList<Integer> fizNot = new ArrayList<>();
        ArrayList<Integer> kimNot = new ArrayList<>();

        matNot.add(10);
        matNot.add(20);
        matNot.add(30);

        fizNot.add(40);
        fizNot.add(50);
        fizNot.add(60);

        kimNot.add(70);
        kimNot.add(80);
        kimNot.add(90);

        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>();
        notlarListesi.add(matNot);
        notlarListesi.add(fizNot);
        notlarListesi.add(kimNot);

        // Soru 1:
        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        // her bir satıra yazdırınız
        // Matematik : 50 70 80
        // Fizik : 30 40
        // Kimya : 60 70 80 90

        ArrayList<String> dersAdlari = new ArrayList<>();
        dersAdlari.add("Matematik = ");
        dersAdlari.add("Fizik = ");
        dersAdlari.add("Kimya = ");

        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.print(dersAdlari.get(i));
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.print(notlarListesi.get(i).get(j)+" ");

            }
            System.out.println();
        }

        // Soru 2 :
        // Kullanıcıdan istediği bir dersin  nosunu alarak (0-Mat, 1-Fiz, 2-Kim)
        // sadece istedği derse ait notları bir metodda yazdırınız.

        System.out.println("****** SORU 2 ******");
        Scanner oku = new Scanner(System.in);
        System.out.print("Ders No ( 0-Mat, 1-Fiz, 2-Kim)=");
        int dersNo = oku.nextInt();

        dersNotYazdir(dersNo,notlarListesi);

    }
    public static void dersNotYazdir(int dersNo , ArrayList<ArrayList<Integer>> notlarListesi){

        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {

            System.out.print( notlarListesi.get(dersNo).get(i)+" ");

        }


    }
}
