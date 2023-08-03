package Tekrar.Gun23;

import java.util.HashSet;

public class _06_HashSetKomutlar {
    public static void main(String[] args) {

        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        HashSet<Integer> setB = new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        System.out.println("Set A yi yaz = "+setA);
        System.out.println("Set B yi yaz = "+setB);

        //BIRLESTIRME

        HashSet<Integer> birlesik = new HashSet<>();
        birlesik.addAll(setA);
        birlesik.addAll(setB);
        System.out.println("Set A ve Set B nin Birlesimi = "+birlesik);


        // FARKLARI

        HashSet<Integer> farklari = new HashSet<>();
        farklari.addAll(setA);
        farklari.removeAll(setB);
        System.out.println("Set A dan Set B yi Cikardik = "+farklari);

        //KESISIMLERI ORTAK ELEMANLARI

        HashSet<Integer> ortakElemanlar = new HashSet<>();
        ortakElemanlar.addAll(setA);
        ortakElemanlar.retainAll(setB);
        System.out.println("A ve B nin Ortak kesisim elemanlari = "+ortakElemanlar);
    }
}
