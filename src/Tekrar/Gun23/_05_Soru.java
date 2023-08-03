package Tekrar.Gun23;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _05_Soru {
    public static void main(String[] args) {
        // 10 elamanlı bir diziyi random(10(dahil) a kadar olan sayılarla
        // doldurduktan, tekrarlı değerleri almayacak şekilde yeni bir
        // diziye atınız.

        Integer[] arrayDizi = new Integer[10];
        for (int i = 0; i < arrayDizi.length; i++) {

            arrayDizi[i] = (int) (Math.random()*11);

        }
        System.out.println("10 lu random dizi = "+Arrays.toString(arrayDizi));

        HashSet<Integer> hs = new HashSet<>();
        //1.YONTEM
        for (int i = 0; i < arrayDizi.length; i++) {
            hs.add(arrayDizi[i]);
        }
        System.out.println("Hashsete dolduruldu = "+hs);

        // 2.BASIT YONTEM
        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(arrayDizi));
        System.out.println("Basit yontemle doldurma = "+ts);

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(Arrays.asList(arrayDizi));
        System.out.println("LinkedHashsetle doldurma = "+lhs);

    }
}
