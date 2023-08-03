package Gun22;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _01_ArrayListKisaYollar {
    public static void main(String[] args) {

        // ArrayList -> Collection metodlari

        ArrayList<Integer> sayilar = new ArrayList<>();

        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);

        System.out.println("Sayilar Array Listesi = "+sayilar);

        // kucukten buyuge siralama
        Collections.sort(sayilar);
        System.out.println("Kucukten Buyuge Siralama = "+sayilar);

        // buyukten kucuge siralama

        Collections.reverse(sayilar);
        System.out.println("Buyukten Kucuge Siralama = "+sayilar);

        // Butun degerleri belirtilen tek bir degerle doldurma

        Collections.fill(sayilar,0);
        System.out.println("Sayilar isimli diziyi sifir ile doldur = "+sayilar);

        //replace belirtilen degere baska deger atama
        Collections.replaceAll(sayilar,0,5);
        System.out.println("Sayilar Array listesindeki sifirlari 5 le degistir = "+sayilar);

        // Tanimlarken deger atama
        int[] dizi = {2,3,45,56};

        ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(3,4,56,78,89));
        ArrayList<String> strListe = new ArrayList<>(Arrays.asList("Ayse" , "Mehmet" , "Cemil"));

        System.out.println("Integer Arraylisteyi yazdir = "+liste);
        System.out.println("String Arraylisteyi yazdir = "+strListe);

        // Addall varolan Array listesine bir veya fazla degeri ilave eder

        Collections.addAll(sayilar,56,77,88,99,78);
        System.out.println("Sayilar listesine yeni elemanlar eklendi = "+sayilar);

        // tek boyutlu diziyi [] Array listin icine atamak

        Integer [] dizi2 = {2,3,45,56};
        ArrayList<Integer> liste3 = new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("Liste 3 isimli Array liste tek boyutlu dizi ekledik = "+liste3);

































    }
}
