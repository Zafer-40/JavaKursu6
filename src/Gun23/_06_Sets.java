package Gun23;

import java.util.HashSet;

public class _06_Sets {
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

        System.out.println("setA = " + setA);
        System.out.println("setB = " + setB);


        //birlestirme
        HashSet<Integer> bislesikHali = new HashSet<>();
        bislesikHali.addAll(setA);
        bislesikHali.addAll(setB);
        System.out.println("A ile B nin birlesimi = "+bislesikHali);

        //farki
        HashSet<Integer> farki = new HashSet<>();
        farki.addAll(setA);
        farki.removeAll(setB); // A dan B yi cikar
        System.out.println("A dan B yi cikar = "+farki);

        // kesisim , ortak elemanlari verir

        HashSet<Integer> ortakElemanlar = new HashSet<>();
        ortakElemanlar.addAll(setA);
        ortakElemanlar.retainAll(setB);
        System.out.println("A ve B deki ortak elemanlar = "+ortakElemanlar);





    }
}
