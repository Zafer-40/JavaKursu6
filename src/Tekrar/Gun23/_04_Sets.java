package Tekrar.Gun23;

import java.util.HashSet;

public class _04_Sets {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(5);
        hs.add(67);
        hs.add(34);
        hs.add(3);
        hs.add(4);
        hs.add(1);
        hs.add(1);
        System.out.println("HashSet yaz = "+hs);

        //HASHSETIN UZUNLUGUNU VERIR
        int uzunluk = hs.size();
        System.out.println("HashSet in uzunlugu = "+uzunluk);

        //SILMEK
        hs.remove(67); // INDEX OLMADIGI ICIN DEGERE GORE SILERIZ
        System.out.println("67 yi sildik = "+hs);

        // HASHSET ICINDE OLAN DEGERI SORGULAR VAR MI YOK MU?
        boolean varMi = hs.contains(67);
        boolean varMi2 = hs.contains(34);
        System.out.println("67 var mi? = "+varMi);
        System.out.println("34 var mi? = "+varMi2);

        //HERSEYI SILMEK
        hs.clear();
        System.out.println("HashSetin hepsini sildik = "+hs);

    }
}
