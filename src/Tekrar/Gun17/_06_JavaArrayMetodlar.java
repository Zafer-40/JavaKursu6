package Tekrar.Gun17;

import java.util.Arrays;

public class _06_JavaArrayMetodlar {
    public static void main(String[] args) {

        //diziyi direk ekrana yazdırmak için

       String[] isimler = {"Buse" , "Ayla" , "Ceyda" , "Deniz" , "Elif"};

       String yaz = Arrays.toString(isimler);
        System.out.println("Isimler dizisini yaz = "+yaz);

        int[] sayilar = {10,9,8,7,6,5,4,3,2,1};

        System.out.println("Sayilari yaz = "+Arrays.toString(sayilar));

        // dizi sıralama

        Arrays.sort(isimler);
        System.out.println("Isimleri sirali yazdiracak = "+Arrays.toString(isimler));

        Arrays.sort(sayilar);
        System.out.println("Sayilari sirali yazdiracak = "+Arrays.toString(sayilar));


        // Diziler Eşit mi
        int[] a={1,8,3,54};
        int[] b={1,8,3,54};
        int[] c={11,3,8,54};

        boolean esitmi = Arrays.equals(a,b); // a b ye esit mi true false donderecek
        boolean esitmi2 = Arrays.equals(b,c);// b c ye esit mi true false donderecek

        System.out.println("a b ye esit mi = " +esitmi);
        System.out.println("b c ye esit mi = " +esitmi2);




        // contais gibi çalışır, var ise pozitif sayı veriri, yok ise negatif
        // sadece sıralı dizilerde çalışır

        int sorgu = Arrays.binarySearch(a,8); // eksi deger verecek cunku a sirali degil
        int sorgu2 = Arrays.binarySearch(c,8); // arti deger verecek c sirali ve 8 rakami var
        int sorgu3 = Arrays.binarySearch(c,18); // eksi degeri verecek c sirali ama 18 rakami yok
        System.out.println("a da 8 var mi = "+sorgu);
        System.out.println("c de 8 var mi = "+sorgu2);
        System.out.println("c de 18 var mi = "+sorgu3);




        // Diziyi hızlıca doldurmak bir değer ile
        Arrays.fill(c,100); // c yi full 100 le doldur
        System.out.println("C dizisi 100 le doldurulacak = "+Arrays.toString(c));

        Arrays.fill(isimler , "BAYRAM"); // isimler dizisi full Ramazan olacak
        System.out.println("Isimleri BAYRAM ile dolduracagiz = "+Arrays.toString(isimler));








    }
}
