package Gun23;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class _05_Soru {
    public static void main(String[] args) {
        // 10 elamanlı bir diziyi random(10(dahil) a kadar olan sayılarla
        // doldurduktan, tekrarlı değerleri almayacak şekilde yeni bir
        // diziye atınız.

        Integer[] dizi = new Integer[10];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random()*11);

        }
        System.out.println("10 elemanli dizi = "+Arrays.toString(dizi));

        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < dizi.length; i++) {
            ts.add(dizi[i]);
        }
        System.out.println("Set olarak yazilacak dizi = "+ts);

        //2.yontem
        TreeSet<Integer> ts2 = new TreeSet<>(Arrays.asList(dizi));
        System.out.println("ikinci yontemle yazdir = "+ts2);

    }
}
