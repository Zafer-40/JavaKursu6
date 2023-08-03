package Tekrar.Gun23;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        // SETS
        // HashSet : Hızlı, bunun için kendine algoritmik sırada tutar.
        // LinkedHashSet : EKLENME SIRASI na göre sıralı tutar.
        // TreeSet : herzaman içinde SIRALI şekilde tutar, kendinden sortlu.

        // HashSet : Hızlı, bunun için kendine algoritmik sırada tutar.
        HashSet<String>hs = new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("uc");
        hs.add("dort");
        hs.add("bes");
        System.out.println("HashSet yazdir = "+hs);

        // LinkedHashSet : EKLENME SIRASI na göre sıralı tutar.

        LinkedHashSet<String>lhs = new LinkedHashSet<>();

        lhs.add("bir");
        lhs.add("iki");
        lhs.add("uc");
        lhs.add("dort");
        lhs.add("bes");
        System.out.println("LinkedHasSet yazdir = "+lhs);

        // TreeSet : herzaman içinde SIRALI şekilde tutar, kendinden sortlu.

        TreeSet<String>ts = new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("uc");
        ts.add("dort");
        ts.add("bes");
        System.out.println("TreeSet yazdir = "+ts);
    }
}
